package com.yuanno.shinobicraft.networking.server;

import com.yuanno.shinobicraft.data.dna.DnaCapability;
import com.yuanno.shinobicraft.data.entity.EntityStatsCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SSyncDnaPacket {
    private int entityId;
    private CompoundTag data;

    public SSyncDnaPacket() {
    }

    public SSyncDnaPacket(LivingEntity entity) {
        this.data = new CompoundTag();
        this.data = DnaCapability.get(entity).serializeNBT();
        this.entityId = entity.getId();
    }

    public void encode(FriendlyByteBuf buffer) {
        buffer.writeInt(this.entityId);
        buffer.writeNbt(this.data);
    }

    public static SSyncDnaPacket decode(FriendlyByteBuf buffer) {
        SSyncDnaPacket msg = new SSyncDnaPacket();
        msg.entityId = buffer.readInt();
        msg.data = buffer.readNbt();
        return msg;
    }

    public static void handle(SSyncDnaPacket message, final Supplier<NetworkEvent.Context> ctx) {
        if (ctx.get().getDirection() == NetworkDirection.PLAY_TO_CLIENT) {
            ctx.get().enqueueWork(() -> {
                ClientHandler.handle(message);
            });
        }
        ctx.get().setPacketHandled(true);
    }

    public static class ClientHandler {
        @OnlyIn(Dist.CLIENT)
        public static void handle(SSyncDnaPacket message) {
            Entity target = Minecraft.getInstance().level.getEntity(message.entityId);
            if (target == null) {
                return;
            }

            if (target instanceof LivingEntity living) {
                DnaCapability.get(living).deserializeNBT(message.data);
            }
        }
    }
}

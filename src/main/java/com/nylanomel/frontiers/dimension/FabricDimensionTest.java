package com.nylanomel.frontiers.dimension;

import static net.minecraft.server.command.CommandManager.literal;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

public class FabricDimensionTest //implements ModInitializer
{
    /*private static RegistryKey<World> dimensionRegistryKey;

    @Override
    public void onInitialize() {
        Registry.register(Registry.CHUNK_GENERATOR, new Identifier("fabric_dimension", "void"), VoidChunkGenerator.CODEC);

        dimensionRegistryKey = RegistryKey.of(Registry.DIMENSION, new Identifier("fabric_dimension", "void"));

        FabricDimensions.registerDefaultPlacer(dimensionRegistryKey, FabricDimensionTest::placeEntityInVoid);

        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) ->
                dispatcher.register(literal("fabric_dimension_test").executes(FabricDimensionTest.this::executeTestCommand))
        );
    }

    private int executeTestCommand(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity serverPlayerEntity = context.getSource().getPlayer();
        ServerWorld serverWorld = serverPlayerEntity.getServerWorld();

        if (!serverWorld.getRegistryKey().equals(dimensionRegistryKey)) {
            serverPlayerEntity.changeDimension(context.getSource().getMinecraftServer().getWorld(dimensionRegistryKey));
        } else {
            FabricDimensions.teleport(serverPlayerEntity, context.getSource().getMinecraftServer().getWorld(World.OVERWORLD), FabricDimensionTest::placeEntity);
        }

        return 1;
    }

    private static BlockPattern.TeleportTarget placeEntity(Entity teleported, ServerWorld destination, Direction portalDir, double horizontalOffset, double verticalOffset) {
        return new BlockPattern.TeleportTarget(new Vec3d(0, 100, 0), Vec3d.ZERO, 0);
    }

    private static BlockPattern.TeleportTarget placeEntityInVoid(Entity teleported, ServerWorld destination, Direction portalDir, double horizontalOffset, double verticalOffset) {
        destination.setBlockState(new BlockPos(0, 100, 0), Blocks.DIAMOND_BLOCK.getDefaultState());
        destination.setBlockState(new BlockPos(0, 101, 0), Blocks.TORCH.getDefaultState());
        return new BlockPattern.TeleportTarget(new Vec3d(0.5, 101, 0.5), Vec3d.ZERO, 0);
    }*/
}

package net.minecraft.commands.arguments;

import com.mojang.serialization.Codec;
import net.minecraft.commands.arguments.blocks.BlockPredicateArgument;
import net.minecraft.commands.arguments.blocks.BlockStateArgument;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.coordinates.ColumnPosArgument;
import net.minecraft.commands.arguments.coordinates.RotationArgument;
import net.minecraft.commands.arguments.coordinates.SwizzleArgument;
import net.minecraft.commands.arguments.coordinates.Vec2Argument;
import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.commands.arguments.item.FunctionArgument;
import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.commands.arguments.item.ItemPredicateArgument;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public class SerializableArgumentTypes {
   public static final Codec<SerializableArgument<?>> CODEC = BuiltInRegistries.COMMAND_ARGUMENT_TYPE
      .byNameCodec()
      .dispatch(SerializableArgument::type, SerializableArgument.Type::codec);
   public static final StreamCodec<RegistryFriendlyByteBuf, SerializableArgument<?>> STREAM_CODEC = ByteBufCodecs.registry(Registries.COMMAND_ARGUMENT_TYPE)
      .dispatch(SerializableArgument::type, SerializableArgument.Type::streamCodec);

   public static void bootstrap(final WritableRegistry<SerializableArgument.Type<?>> registry) {
      Registry.register(registry, "angle", AngleArgument.TYPE);
      Registry.register(registry, "block_pos", BlockPosArgument.TYPE);
      Registry.register(registry, "block_predicate", BlockPredicateArgument.TYPE);
      Registry.register(registry, "block_state", BlockStateArgument.TYPE);
      Registry.register(registry, "bool", BooleanArgument.TYPE);
      Registry.register(registry, "column_pos", ColumnPosArgument.TYPE);
      Registry.register(registry, "component", ComponentArgument.TYPE);
      Registry.register(registry, "context_float_provider", ContextFloatProviderArgument.TYPE);
      Registry.register(registry, "context_int_provider", ContextIntProviderArgument.TYPE);
      Registry.register(registry, "dialog", DialogArgument.TYPE);
      Registry.register(registry, "dimension", DimensionArgument.TYPE);
      Registry.register(registry, "double", DoubleArgument.TYPE);
      Registry.register(registry, "entity", EntityArgument.TYPE);
      Registry.register(registry, "entity_anchor", EntityAnchorArgument.TYPE);
      Registry.register(registry, "feature", FeatureArgument.TYPE);
      Registry.register(registry, "float", FloatArgument.TYPE);
      Registry.register(registry, "float_range", RangeArgument.Floats.TYPE);
      Registry.register(registry, "function", FunctionArgument.TYPE);
      Registry.register(registry, "game_profile", GameProfileArgument.TYPE);
      Registry.register(registry, "gamemode", GameModeArgument.TYPE);
      Registry.register(registry, "heightmap", HeightmapTypeArgument.TYPE);
      Registry.register(registry, "hex_color", HexColorArgument.TYPE);
      Registry.register(registry, "int_range", RangeArgument.Ints.TYPE);
      Registry.register(registry, "integer", IntegerArgument.TYPE);
      Registry.register(registry, "item_predicate", ItemPredicateArgument.TYPE);
      Registry.register(registry, "item_slot", SlotArgument.TYPE);
      Registry.register(registry, "item_slots", SlotsArgument.TYPE);
      Registry.register(registry, "item_stack", ItemArgument.TYPE);
      Registry.register(registry, "long", LongArgument.TYPE);
      Registry.register(registry, "loot_modifier", LootModifierArgument.TYPE);
      Registry.register(registry, "loot_predicate", LootPredicateArgument.TYPE);
      Registry.register(registry, "loot_table", LootTableArgument.TYPE);
      Registry.register(registry, "message", MessageArgument.TYPE);
      Registry.register(registry, "nbt_compound_tag", CompoundTagArgument.TYPE);
      Registry.register(registry, "nbt_path", NbtPathArgument.TYPE);
      Registry.register(registry, "nbt_tag", NbtTagArgument.TYPE);
      Registry.register(registry, "objective", ObjectiveArgument.TYPE);
      Registry.register(registry, "objective_criteria", ObjectiveCriteriaArgument.TYPE);
      Registry.register(registry, "operation", OperationArgument.TYPE);
      Registry.register(registry, "particle", ParticleArgument.TYPE);
      Registry.register(registry, "pattern", PatternStringArgument.TYPE);
      Registry.register(registry, "resource", ResourceArgument.TYPE);
      Registry.register(registry, "resource_location", IdentifierArgument.TYPE);
      Registry.register(registry, "resource_or_tag", ResourceOrTagArgument.TYPE);
      Registry.register(registry, "resource_selector", ResourceSelectorArgument.TYPE);
      Registry.register(registry, "rotation", RotationArgument.TYPE);
      Registry.register(registry, "score_holder", ScoreHolderArgument.TYPE);
      Registry.register(registry, "scoreboard_slot", ScoreboardSlotArgument.TYPE);
      Registry.register(registry, "slot_source", SlotSourceArgument.TYPE);
      Registry.register(registry, "string", StringArgument.TYPE);
      Registry.register(registry, "style", StyleArgument.TYPE);
      Registry.register(registry, "swing_animation", SwingAnimationArgument.TYPE);
      Registry.register(registry, "swizzle", SwizzleArgument.TYPE);
      Registry.register(registry, "team", TeamArgument.TYPE);
      Registry.register(registry, "team_color", TeamColorArgument.TYPE);
      Registry.register(registry, "template_mirror", TemplateMirrorArgument.TYPE);
      Registry.register(registry, "template_rotation", TemplateRotationArgument.TYPE);
      Registry.register(registry, "time", TimeArgument.TYPE);
      Registry.register(registry, "uuid", UuidArgument.TYPE);
      Registry.register(registry, "vec2", Vec2Argument.TYPE);
      Registry.register(registry, "vec3", Vec3Argument.TYPE);
   }
}

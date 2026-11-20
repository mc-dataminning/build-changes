package net.minecraft.network.protocol.game;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.function.BiPredicate;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.commands.arguments.SerializableArgumentTypes;
import net.minecraft.commands.suggestions.CustomSuggestion;
import net.minecraft.commands.suggestions.SerializableCustomSuggestion;
import net.minecraft.commands.suggestions.SerializableSuggestionTypes;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;
import net.minecraft.network.protocol.common.ClientCommonPacketListener;
import net.minecraft.network.protocol.common.CommonPacketTypes;
import org.jspecify.annotations.Nullable;

public class ClientboundCommandsPacket implements Packet<ClientCommonPacketListener> {
   private static final StreamCodec<RegistryFriendlyByteBuf, ClientboundCommandsPacket.Entry> ENTRY_STREAM_CODEC = StreamCodec.of(
      (output, entry) -> entry.write(output), ClientboundCommandsPacket::readNode
   );
   private static final StreamCodec<RegistryFriendlyByteBuf, ClientboundCommandsPacket> RAW_STREAM_CODEC = StreamCodec.composite(
      ENTRY_STREAM_CODEC.apply(ByteBufCodecs.list()), p -> p.entries, ByteBufCodecs.VAR_INT, p -> p.rootIndex, ClientboundCommandsPacket::new
   );
   public static final StreamCodec<ByteBuf, ClientboundCommandsPacket> STREAM_CODEC = RAW_STREAM_CODEC.mapStream(
      s -> new RegistryFriendlyByteBuf(s.unwrap(), RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY))
   );
   private static final byte MASK_TYPE = 3;
   private static final byte FLAG_EXECUTABLE = 4;
   private static final byte FLAG_REDIRECT = 8;
   private static final byte FLAG_CUSTOM_SUGGESTIONS = 16;
   private static final byte FLAG_RESTRICTED = 32;
   private static final byte TYPE_ROOT = 0;
   private static final byte TYPE_LITERAL = 1;
   private static final byte TYPE_ARGUMENT = 2;
   private final int rootIndex;
   private final List<ClientboundCommandsPacket.Entry> entries;

   public <S, T extends S> ClientboundCommandsPacket(final RootCommandNode<T> root, final ClientboundCommandsPacket.NodeInspector<S> inspector) {
      Object2IntMap<CommandNode<T>> nodeToId = enumerateNodes(root);
      this.entries = createEntries(nodeToId, inspector);
      this.rootIndex = nodeToId.getInt(root);
   }

   private ClientboundCommandsPacket(final List<ClientboundCommandsPacket.Entry> entries, final int rootIndex) {
      this.entries = entries;
      this.rootIndex = rootIndex;
      validateEntries(this.entries);
   }

   private static void validateEntries(
      final List<ClientboundCommandsPacket.Entry> entries, final BiPredicate<ClientboundCommandsPacket.Entry, IntSet> validator
   ) {
      IntSet elementsToCheck = new IntOpenHashSet(IntSets.fromTo(0, entries.size()));

      while (!elementsToCheck.isEmpty()) {
         boolean worked = elementsToCheck.removeIf(index -> validator.test(entries.get(index), elementsToCheck));
         if (!worked) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void validateEntries(final List<ClientboundCommandsPacket.Entry> entries) {
      validateEntries(entries, ClientboundCommandsPacket.Entry::canBuild);
      validateEntries(entries, ClientboundCommandsPacket.Entry::canResolve);
   }

   private static <S> Object2IntMap<CommandNode<S>> enumerateNodes(final RootCommandNode<S> root) {
      Object2IntMap<CommandNode<S>> nodeToId = new Object2IntOpenHashMap();
      Queue<CommandNode<S>> queue = new ArrayDeque<>();
      queue.add(root);

      CommandNode<S> node;
      while ((node = queue.poll()) != null) {
         if (!nodeToId.containsKey(node)) {
            int id = nodeToId.size();
            nodeToId.put(node, id);
            queue.addAll(node.getChildren());
            if (node.getRedirect() != null) {
               queue.add(node.getRedirect());
            }
         }
      }

      return nodeToId;
   }

   private static <S> List<ClientboundCommandsPacket.Entry> createEntries(
      final Object2IntMap<? extends CommandNode<? extends S>> nodeToId, final ClientboundCommandsPacket.NodeInspector<S> inspector
   ) {
      ObjectArrayList<ClientboundCommandsPacket.Entry> result = new ObjectArrayList(nodeToId.size());
      result.size(nodeToId.size());
      ObjectIterator var3 = Object2IntMaps.fastIterable(nodeToId).iterator();

      while (var3.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<? extends CommandNode<? extends S>> entry = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<? extends CommandNode<? extends S>>)var3.next();
         result.set(entry.getIntValue(), createEntry((CommandNode<? extends S>)entry.getKey(), inspector, nodeToId));
      }

      return result;
   }

   private static ClientboundCommandsPacket.Entry readNode(final RegistryFriendlyByteBuf input) {
      byte flags = input.readByte();
      int[] children = input.readVarIntArray();
      int redirect = (flags & 8) != 0 ? input.readVarInt() : 0;
      ClientboundCommandsPacket.NodeStub stub = read(input, flags);
      return new ClientboundCommandsPacket.Entry(stub, flags, redirect, children);
   }

   private static ClientboundCommandsPacket.@Nullable NodeStub read(final RegistryFriendlyByteBuf input, final byte flags) {
      int type = flags & 3;
      if (type == 2) {
         StreamCodec<RegistryFriendlyByteBuf, ? extends ClientboundCommandsPacket.NodeStub> argumentCodec = (flags & 16) != 0
            ? ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion.STREAM_CODEC
            : ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion.STREAM_CODEC;
         return argumentCodec.decode(input);
      } else {
         return type == 1 ? ClientboundCommandsPacket.LiteralNodeStub.STREAM_CODEC.decode(input) : null;
      }
   }

   private static <S> ClientboundCommandsPacket.Entry createEntry(
      final CommandNode<? extends S> node,
      final ClientboundCommandsPacket.NodeInspector<S> inspector,
      final Object2IntMap<? extends CommandNode<? extends S>> ids
   ) {
      int flags = 0;
      int redirect;
      if (node.getRedirect() != null) {
         flags |= 8;
         redirect = ids.getInt(node.getRedirect());
      } else {
         redirect = 0;
      }

      if (inspector.isExecutable(node)) {
         flags |= 4;
      }

      if (inspector.isRestricted(node)) {
         flags |= 32;
      }

      ClientboundCommandsPacket.NodeStub nodeStub;
      switch (node) {
         case RootCommandNode<? extends S> ignored:
            flags |= 0;
            nodeStub = null;
            break;
         case ArgumentCommandNode<? extends S, ?> arg:
            String id = arg.getName();
            SerializableArgument.BrigadierWrapper<?> type = SerializableArgument.unwrapOrThrow(arg.getType());
            flags |= 2;
            SuggestionProvider<? extends S> customSuggestions = arg.getCustomSuggestions();
            if (customSuggestions != null) {
               nodeStub = new ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion(
                  id, type.argument(), CustomSuggestion.unwrapOrThrow(customSuggestions).suggestion().serializable()
               );
               flags |= 16;
            } else {
               nodeStub = new ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion(id, type.argument());
            }
            break;
         case LiteralCommandNode<? extends S> literal:
            nodeStub = new ClientboundCommandsPacket.LiteralNodeStub(literal.getLiteral());
            flags |= 1;
            break;
         default:
            throw new UnsupportedOperationException("Unknown node type " + node);
      }

      int[] childrenIds = node.getChildren().stream().mapToInt(ids::getInt).toArray();
      return new ClientboundCommandsPacket.Entry(nodeStub, flags, redirect, childrenIds);
   }

   @Override
   public PacketType<ClientboundCommandsPacket> type() {
      return CommonPacketTypes.CLIENTBOUND_COMMANDS;
   }

   public void handle(final ClientCommonPacketListener listener) {
      listener.handleCommands(this);
   }

   public <S> RootCommandNode<S> getRoot(final ClientboundCommandsPacket.NodeBuilder<S> builder) {
      return (RootCommandNode<S>)new ClientboundCommandsPacket.NodeResolver<>(builder, this.entries).resolve(this.rootIndex);
   }

   private record ArgumentNodeStubWithSuggestion(String id, SerializableArgument<?> argument, SerializableCustomSuggestion customSuggestion)
      implements ClientboundCommandsPacket.NodeStub {
      public static final StreamCodec<RegistryFriendlyByteBuf, ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion> STREAM_CODEC = StreamCodec.composite(
         ByteBufCodecs.STRING_UTF8,
         ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion::id,
         SerializableArgumentTypes.STREAM_CODEC,
         ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion::argument,
         SerializableSuggestionTypes.STREAM_CODEC,
         ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion::customSuggestion,
         ClientboundCommandsPacket.ArgumentNodeStubWithSuggestion::new
      );

      @Override
      public <S> ArgumentBuilder<S, ?> build(final ClientboundCommandsPacket.NodeBuilder<S> builder) {
         return builder.createArgument(this.id, this.argument.toBrigadier(), this.customSuggestion);
      }

      @Override
      public void write(final RegistryFriendlyByteBuf output) {
         STREAM_CODEC.encode(output, this);
      }
   }

   private record ArgumentNodeStubWithoutSuggestion(String id, SerializableArgument<?> argument) implements ClientboundCommandsPacket.NodeStub {
      public static final StreamCodec<RegistryFriendlyByteBuf, ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion> STREAM_CODEC = StreamCodec.composite(
         ByteBufCodecs.STRING_UTF8,
         ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion::id,
         SerializableArgumentTypes.STREAM_CODEC,
         ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion::argument,
         ClientboundCommandsPacket.ArgumentNodeStubWithoutSuggestion::new
      );

      @Override
      public <S> ArgumentBuilder<S, ?> build(final ClientboundCommandsPacket.NodeBuilder<S> builder) {
         return builder.createArgument(this.id, this.argument.toBrigadier(), null);
      }

      @Override
      public void write(final RegistryFriendlyByteBuf output) {
         STREAM_CODEC.encode(output, this);
      }
   }

   private record Entry(ClientboundCommandsPacket.@Nullable NodeStub stub, int flags, int redirect, int[] children) {
      public void write(final RegistryFriendlyByteBuf output) {
         output.writeByte(this.flags);
         output.writeVarIntArray(this.children);
         if ((this.flags & 8) != 0) {
            output.writeVarInt(this.redirect);
         }

         if (this.stub != null) {
            this.stub.write(output);
         }
      }

      public boolean canBuild(final IntSet unbuiltNodes) {
         return (this.flags & 8) != 0 ? !unbuiltNodes.contains(this.redirect) : true;
      }

      public boolean canResolve(final IntSet unresolvedNodes) {
         for (int child : this.children) {
            if (unresolvedNodes.contains(child)) {
               return false;
            }
         }

         return true;
      }
   }

   private record LiteralNodeStub(String id) implements ClientboundCommandsPacket.NodeStub {
      public static final StreamCodec<ByteBuf, ClientboundCommandsPacket.LiteralNodeStub> STREAM_CODEC = StreamCodec.composite(
         ByteBufCodecs.STRING_UTF8, ClientboundCommandsPacket.LiteralNodeStub::id, ClientboundCommandsPacket.LiteralNodeStub::new
      );

      @Override
      public <S> ArgumentBuilder<S, ?> build(final ClientboundCommandsPacket.NodeBuilder<S> builder) {
         return builder.createLiteral(this.id);
      }

      @Override
      public void write(final RegistryFriendlyByteBuf output) {
         STREAM_CODEC.encode(output, this);
      }
   }

   public interface NodeBuilder<S> {
      ArgumentBuilder<S, ?> createLiteral(String id);

      ArgumentBuilder<S, ?> createArgument(String id, ArgumentType<?> argumentType, @Nullable CustomSuggestion customSuggestion);

      ArgumentBuilder<S, ?> configure(ArgumentBuilder<S, ?> input, boolean executable, boolean restricted);
   }

   public interface NodeInspector<S> {
      boolean isExecutable(CommandNode<? extends S> node);

      boolean isRestricted(CommandNode<? extends S> node);
   }

   private static class NodeResolver<S> {
      private final ClientboundCommandsPacket.NodeBuilder<S> builder;
      private final List<ClientboundCommandsPacket.Entry> entries;
      private final List<CommandNode<S>> nodes;

      private NodeResolver(final ClientboundCommandsPacket.NodeBuilder<S> builder, final List<ClientboundCommandsPacket.Entry> entries) {
         this.builder = builder;
         this.entries = entries;
         ObjectArrayList<CommandNode<S>> nodes = new ObjectArrayList();
         nodes.size(entries.size());
         this.nodes = nodes;
      }

      public CommandNode<S> resolve(final int index) {
         CommandNode<S> currentNode = this.nodes.get(index);
         if (currentNode != null) {
            return currentNode;
         }

         ClientboundCommandsPacket.Entry entry = this.entries.get(index);
         CommandNode<S> result;
         if (entry.stub == null) {
            result = new RootCommandNode();
         } else {
            ArgumentBuilder<S, ?> resultBuilder = entry.stub.build(this.builder);
            if ((entry.flags & 8) != 0) {
               resultBuilder.redirect(this.resolve(entry.redirect));
            }

            boolean isExecutable = (entry.flags & 4) != 0;
            boolean isRestricted = (entry.flags & 32) != 0;
            result = this.builder.configure(resultBuilder, isExecutable, isRestricted).build();
         }

         this.nodes.set(index, result);

         for (int childId : entry.children) {
            CommandNode<S> child = this.resolve(childId);
            if (!(child instanceof RootCommandNode)) {
               result.addChild(child);
            }
         }

         return result;
      }
   }

   private interface NodeStub {
      <S> ArgumentBuilder<S, ?> build(ClientboundCommandsPacket.NodeBuilder<S> builder);

      void write(RegistryFriendlyByteBuf output);
   }
}

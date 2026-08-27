import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Queue;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;

public class vi implements uo<ur> {
   private static final byte a = 3;
   private static final byte b = 4;
   private static final byte c = 8;
   private static final byte d = 16;
   private static final byte e = 0;
   private static final byte f = 1;
   private static final byte g = 2;
   private final int h;
   private final List<vi.b> i;

   public vi(RootCommandNode<du> $$0) {
      Object2IntMap<CommandNode<du>> $$1 = a($$0);
      this.i = a($$1);
      this.h = $$1.getInt($$0);
   }

   public vi(sf $$0) {
      this.i = $$0.a(vi::b);
      this.h = $$0.m();
      a(this.i);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.i, ($$0x, $$1) -> $$1.a($$0x));
      $$0.d(this.h);
   }

   private static void a(List<vi.b> $$0, BiPredicate<vi.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<vi.b> $$0) {
      a($$0, vi.b::a);
      a($$0, vi.b::b);
   }

   private static Object2IntMap<CommandNode<du>> a(RootCommandNode<du> $$0) {
      Object2IntMap<CommandNode<du>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<du>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<du> $$3;
      while (($$3 = $$2.poll()) != null) {
         if (!$$1.containsKey($$3)) {
            int $$4 = $$1.size();
            $$1.put($$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() != null) {
               $$2.add($$3.getRedirect());
            }
         }
      }

      return $$1;
   }

   private static List<vi.b> a(Object2IntMap<CommandNode<du>> $$0) {
      ObjectArrayList<vi.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<du>> $$2 = (Entry<CommandNode<du>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<du>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static vi.b b(sf $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.m() : 0;
      vi.e $$4 = a($$0, $$1);
      return new vi.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static vi.e a(sf $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.s();
         int $$4 = $$0.m();
         gg<?, ?> $$5 = jb.x.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            gg.a<?> $$6 = $$5.b($$0);
            acq $$7 = ($$1 & 16) != 0 ? $$0.t() : null;
            return new vi.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.s();
         return new vi.c($$8);
      } else {
         return null;
      }
   }

   private static vi.b a(CommandNode<du> $$0, Object2IntMap<CommandNode<du>> $$1) {
      int $$2 = 0;
      int $$3;
      if ($$0.getRedirect() != null) {
         $$2 |= 8;
         $$3 = $$1.getInt($$0.getRedirect());
      } else {
         $$3 = 0;
      }

      if ($$0.getCommand() != null) {
         $$2 |= 4;
      }

      vi.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<du, ?> $$6) {
         $$5 = new vi.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new vi.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new vi.b($$5, $$2, $$3, $$11);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public RootCommandNode<du> a(dm $$0) {
      return (RootCommandNode<du>)new vi.d($$0, this.i).a(this.h);
   }

   static class a implements vi.e {
      private final String a;
      private final gg.a<?> b;
      @Nullable
      private final acq c;

      @Nullable
      private static acq a(@Nullable SuggestionProvider<du> $$0) {
         return $$0 != null ? gk.a($$0) : null;
      }

      a(String $$0, gg.a<?> $$1, @Nullable acq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<du, ?> $$0) {
         this($$0.getName(), gh.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<du, ?> a(dm $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<du, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(gk.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(sf $$0, gg.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends gg.a<A>> void a(sf $$0, gg<A, T> $$1, gg.a<A> $$2) {
         $$0.d(jb.x.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final vi.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable vi.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(sf $$0) {
         $$0.writeByte(this.b);
         $$0.a(this.d);
         if ((this.b & 8) != 0) {
            $$0.d(this.c);
         }

         if (this.a != null) {
            this.a.a($$0);
         }
      }

      public boolean a(IntSet $$0) {
         return (this.b & 8) != 0 ? !$$0.contains(this.c) : true;
      }

      public boolean b(IntSet $$0) {
         for (int $$1 : this.d) {
            if ($$0.contains($$1)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c implements vi.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<du, ?> a(dm $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final dm a;
      private final List<vi.b> b;
      private final List<CommandNode<du>> c;

      d(dm $$0, List<vi.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<du>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<du> a(int $$0) {
         CommandNode<du> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            vi.b $$2 = this.b.get($$0);
            CommandNode<du> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<du, ?> $$4 = $$2.a.a(this.a);
               if (($$2.b & 8) != 0) {
                  $$4.redirect(this.a($$2.c));
               }

               if (($$2.b & 4) != 0) {
                  $$4.executes($$0x -> 0);
               }

               $$3 = $$4.build();
            }

            this.c.set($$0, $$3);

            for (int $$6 : $$2.d) {
               CommandNode<du> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<du, ?> a(dm var1);

      void a(sf var1);
   }
}

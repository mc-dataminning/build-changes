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

public class xh implements uw<wo> {
   private static final byte a = 3;
   private static final byte b = 4;
   private static final byte c = 8;
   private static final byte d = 16;
   private static final byte e = 0;
   private static final byte f = 1;
   private static final byte g = 2;
   private final int h;
   private final List<xh.b> i;

   public xh(RootCommandNode<dv> $$0) {
      Object2IntMap<CommandNode<dv>> $$1 = a($$0);
      this.i = a($$1);
      this.h = $$1.getInt($$0);
   }

   public xh(sh $$0) {
      this.i = $$0.a(xh::b);
      this.h = $$0.m();
      a(this.i);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.i, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.h);
   }

   private static void a(List<xh.b> $$0, BiPredicate<xh.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<xh.b> $$0) {
      a($$0, xh.b::a);
      a($$0, xh.b::b);
   }

   private static Object2IntMap<CommandNode<dv>> a(RootCommandNode<dv> $$0) {
      Object2IntMap<CommandNode<dv>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<dv>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<dv> $$3;
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

   private static List<xh.b> a(Object2IntMap<CommandNode<dv>> $$0) {
      ObjectArrayList<xh.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<dv>> $$2 = (Entry<CommandNode<dv>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<dv>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static xh.b b(sh $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.m() : 0;
      xh.e $$4 = a($$0, $$1);
      return new xh.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static xh.e a(sh $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.r();
         int $$4 = $$0.m();
         gh<?, ?> $$5 = jc.x.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            gh.a<?> $$6 = $$5.b($$0);
            aep $$7 = ($$1 & 16) != 0 ? $$0.s() : null;
            return new xh.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.r();
         return new xh.c($$8);
      } else {
         return null;
      }
   }

   private static xh.b a(CommandNode<dv> $$0, Object2IntMap<CommandNode<dv>> $$1) {
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

      xh.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<dv, ?> $$6) {
         $$5 = new xh.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new xh.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new xh.b($$5, $$2, $$3, $$11);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public RootCommandNode<dv> a(dm $$0) {
      return (RootCommandNode<dv>)new xh.d($$0, this.i).a(this.h);
   }

   static class a implements xh.e {
      private final String a;
      private final gh.a<?> b;
      @Nullable
      private final aep c;

      @Nullable
      private static aep a(@Nullable SuggestionProvider<dv> $$0) {
         return $$0 != null ? gl.a($$0) : null;
      }

      a(String $$0, gh.a<?> $$1, @Nullable aep $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<dv, ?> $$0) {
         this($$0.getName(), gi.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<dv, ?> a(dm $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<dv, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(gl.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(sh $$0, gh.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends gh.a<A>> void a(sh $$0, gh<A, T> $$1, gh.a<A> $$2) {
         $$0.c(jc.x.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final xh.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable xh.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(sh $$0) {
         $$0.k(this.b);
         $$0.a(this.d);
         if ((this.b & 8) != 0) {
            $$0.c(this.c);
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

   static class c implements xh.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<dv, ?> a(dm $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final dm a;
      private final List<xh.b> b;
      private final List<CommandNode<dv>> c;

      d(dm $$0, List<xh.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<dv>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<dv> a(int $$0) {
         CommandNode<dv> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            xh.b $$2 = this.b.get($$0);
            CommandNode<dv> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<dv, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<dv> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<dv, ?> a(dm var1);

      void a(sh var1);
   }
}

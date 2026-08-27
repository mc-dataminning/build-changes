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

public class xo implements vd<ww> {
   private static final byte a = 3;
   private static final byte b = 4;
   private static final byte c = 8;
   private static final byte d = 16;
   private static final byte e = 0;
   private static final byte f = 1;
   private static final byte g = 2;
   private final int h;
   private final List<xo.b> i;

   public xo(RootCommandNode<dw> $$0) {
      Object2IntMap<CommandNode<dw>> $$1 = a($$0);
      this.i = a($$1);
      this.h = $$1.getInt($$0);
   }

   public xo(so $$0) {
      this.i = $$0.a(xo::b);
      this.h = $$0.m();
      a(this.i);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.i, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.h);
   }

   private static void a(List<xo.b> $$0, BiPredicate<xo.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<xo.b> $$0) {
      a($$0, xo.b::a);
      a($$0, xo.b::b);
   }

   private static Object2IntMap<CommandNode<dw>> a(RootCommandNode<dw> $$0) {
      Object2IntMap<CommandNode<dw>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<dw>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<dw> $$3;
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

   private static List<xo.b> a(Object2IntMap<CommandNode<dw>> $$0) {
      ObjectArrayList<xo.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<dw>> $$2 = (Entry<CommandNode<dw>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<dw>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static xo.b b(so $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.m() : 0;
      xo.e $$4 = a($$0, $$1);
      return new xo.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static xo.e a(so $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.r();
         int $$4 = $$0.m();
         gi<?, ?> $$5 = jb.x.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            gi.a<?> $$6 = $$5.b($$0);
            aew $$7 = ($$1 & 16) != 0 ? $$0.s() : null;
            return new xo.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.r();
         return new xo.c($$8);
      } else {
         return null;
      }
   }

   private static xo.b a(CommandNode<dw> $$0, Object2IntMap<CommandNode<dw>> $$1) {
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

      xo.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<dw, ?> $$6) {
         $$5 = new xo.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new xo.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new xo.b($$5, $$2, $$3, $$11);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public RootCommandNode<dw> a(dn $$0) {
      return (RootCommandNode<dw>)new xo.d($$0, this.i).a(this.h);
   }

   static class a implements xo.e {
      private final String a;
      private final gi.a<?> b;
      @Nullable
      private final aew c;

      @Nullable
      private static aew a(@Nullable SuggestionProvider<dw> $$0) {
         return $$0 != null ? gm.a($$0) : null;
      }

      a(String $$0, gi.a<?> $$1, @Nullable aew $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<dw, ?> $$0) {
         this($$0.getName(), gj.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<dw, ?> a(dn $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<dw, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(gm.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(so $$0, gi.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends gi.a<A>> void a(so $$0, gi<A, T> $$1, gi.a<A> $$2) {
         $$0.c(jb.x.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final xo.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable xo.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(so $$0) {
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

   static class c implements xo.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<dw, ?> a(dn $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final dn a;
      private final List<xo.b> b;
      private final List<CommandNode<dw>> c;

      d(dn $$0, List<xo.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<dw>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<dw> a(int $$0) {
         CommandNode<dw> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            xo.b $$2 = this.b.get($$0);
            CommandNode<dw> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<dw, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<dw> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<dw, ?> a(dn var1);

      void a(so var1);
   }
}

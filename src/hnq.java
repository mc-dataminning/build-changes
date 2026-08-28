import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class hnq {
   public static final hnq a = new hnq(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<gtg> b;
   private final List<gtg> c;
   private final List<gtg> d;
   private final List<gtg> e;
   private final List<gtg> f;
   private final List<gtg> g;
   private final List<gtg> h;
   private final List<gtg> i;

   hnq(List<gtg> $$0, List<gtg> $$1, List<gtg> $$2, List<gtg> $$3, List<gtg> $$4, List<gtg> $$5, List<gtg> $$6, List<gtg> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<gtg> a(@Nullable jb $$0) {
      return switch ($$0) {
         case null -> this.c;
         case NORTH -> this.d;
         case SOUTH -> this.e;
         case EAST -> this.f;
         case WEST -> this.g;
         case UP -> this.h;
         case DOWN -> this.i;
         default -> throw new MatchException(null, null);
      };
   }

   public List<gtg> a() {
      return this.b;
   }

   public static class a {
      private final Builder<gtg> a = ImmutableList.builder();
      private final Multimap<jb, gtg> b = ArrayListMultimap.create();

      public hnq.a a(jb $$0, gtg $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public hnq.a a(gtg $$0) {
         this.a.add($$0);
         return this;
      }

      private static hnq a(List<gtg> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<gtg> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<gtg> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<gtg> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<gtg> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<gtg> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<gtg> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<gtg> $$15 = $$0.subList($$8, $$8 + $$7);
         return new hnq($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public hnq a() {
         ImmutableList<gtg> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? hnq.a : new hnq($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<gtg> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<gtg> $$2 = this.b.get(jb.c);
            $$1.addAll($$2);
            Collection<gtg> $$3 = this.b.get(jb.d);
            $$1.addAll($$3);
            Collection<gtg> $$4 = this.b.get(jb.f);
            $$1.addAll($$4);
            Collection<gtg> $$5 = this.b.get(jb.e);
            $$1.addAll($$5);
            Collection<gtg> $$6 = this.b.get(jb.b);
            $$1.addAll($$6);
            Collection<gtg> $$7 = this.b.get(jb.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class hns {
   public static final hns a = new hns(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<gti> b;
   private final List<gti> c;
   private final List<gti> d;
   private final List<gti> e;
   private final List<gti> f;
   private final List<gti> g;
   private final List<gti> h;
   private final List<gti> i;

   hns(List<gti> $$0, List<gti> $$1, List<gti> $$2, List<gti> $$3, List<gti> $$4, List<gti> $$5, List<gti> $$6, List<gti> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<gti> a(@Nullable jc $$0) {
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

   public List<gti> a() {
      return this.b;
   }

   public static class a {
      private final Builder<gti> a = ImmutableList.builder();
      private final Multimap<jc, gti> b = ArrayListMultimap.create();

      public hns.a a(jc $$0, gti $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public hns.a a(gti $$0) {
         this.a.add($$0);
         return this;
      }

      private static hns a(List<gti> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<gti> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<gti> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<gti> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<gti> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<gti> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<gti> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<gti> $$15 = $$0.subList($$8, $$8 + $$7);
         return new hns($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public hns a() {
         ImmutableList<gti> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? hns.a : new hns($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<gti> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<gti> $$2 = this.b.get(jc.c);
            $$1.addAll($$2);
            Collection<gti> $$3 = this.b.get(jc.d);
            $$1.addAll($$3);
            Collection<gti> $$4 = this.b.get(jc.f);
            $$1.addAll($$4);
            Collection<gti> $$5 = this.b.get(jc.e);
            $$1.addAll($$5);
            Collection<gti> $$6 = this.b.get(jc.b);
            $$1.addAll($$6);
            Collection<gti> $$7 = this.b.get(jc.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}

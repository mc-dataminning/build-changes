import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class hma {
   public static final hma a = new hma(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<grs> b;
   private final List<grs> c;
   private final List<grs> d;
   private final List<grs> e;
   private final List<grs> f;
   private final List<grs> g;
   private final List<grs> h;
   private final List<grs> i;

   hma(List<grs> $$0, List<grs> $$1, List<grs> $$2, List<grs> $$3, List<grs> $$4, List<grs> $$5, List<grs> $$6, List<grs> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<grs> a(@Nullable jb $$0) {
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

   public List<grs> a() {
      return this.b;
   }

   public static class a {
      private final Builder<grs> a = ImmutableList.builder();
      private final Multimap<jb, grs> b = ArrayListMultimap.create();

      public hma.a a(jb $$0, grs $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public hma.a a(grs $$0) {
         this.a.add($$0);
         return this;
      }

      private static hma a(List<grs> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<grs> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<grs> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<grs> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<grs> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<grs> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<grs> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<grs> $$15 = $$0.subList($$8, $$8 + $$7);
         return new hma($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public hma a() {
         ImmutableList<grs> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? hma.a : new hma($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<grs> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<grs> $$2 = this.b.get(jb.c);
            $$1.addAll($$2);
            Collection<grs> $$3 = this.b.get(jb.d);
            $$1.addAll($$3);
            Collection<grs> $$4 = this.b.get(jb.f);
            $$1.addAll($$4);
            Collection<grs> $$5 = this.b.get(jb.e);
            $$1.addAll($$5);
            Collection<grs> $$6 = this.b.get(jb.b);
            $$1.addAll($$6);
            Collection<grs> $$7 = this.b.get(jb.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class hmh {
   public static final hmh a = new hmh(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<grx> b;
   private final List<grx> c;
   private final List<grx> d;
   private final List<grx> e;
   private final List<grx> f;
   private final List<grx> g;
   private final List<grx> h;
   private final List<grx> i;

   hmh(List<grx> $$0, List<grx> $$1, List<grx> $$2, List<grx> $$3, List<grx> $$4, List<grx> $$5, List<grx> $$6, List<grx> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<grx> a(@Nullable jb $$0) {
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

   public List<grx> a() {
      return this.b;
   }

   public static class a {
      private final Builder<grx> a = ImmutableList.builder();
      private final Multimap<jb, grx> b = ArrayListMultimap.create();

      public hmh.a a(jb $$0, grx $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public hmh.a a(grx $$0) {
         this.a.add($$0);
         return this;
      }

      private static hmh a(List<grx> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<grx> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<grx> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<grx> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<grx> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<grx> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<grx> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<grx> $$15 = $$0.subList($$8, $$8 + $$7);
         return new hmh($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public hmh a() {
         ImmutableList<grx> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? hmh.a : new hmh($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<grx> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<grx> $$2 = this.b.get(jb.c);
            $$1.addAll($$2);
            Collection<grx> $$3 = this.b.get(jb.d);
            $$1.addAll($$3);
            Collection<grx> $$4 = this.b.get(jb.f);
            $$1.addAll($$4);
            Collection<grx> $$5 = this.b.get(jb.e);
            $$1.addAll($$5);
            Collection<grx> $$6 = this.b.get(jb.b);
            $$1.addAll($$6);
            Collection<grx> $$7 = this.b.get(jb.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}

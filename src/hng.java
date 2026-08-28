import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class hng {
   public static final hng a = new hng(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<gst> b;
   private final List<gst> c;
   private final List<gst> d;
   private final List<gst> e;
   private final List<gst> f;
   private final List<gst> g;
   private final List<gst> h;
   private final List<gst> i;

   hng(List<gst> $$0, List<gst> $$1, List<gst> $$2, List<gst> $$3, List<gst> $$4, List<gst> $$5, List<gst> $$6, List<gst> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<gst> a(@Nullable jc $$0) {
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

   public List<gst> a() {
      return this.b;
   }

   public static class a {
      private final Builder<gst> a = ImmutableList.builder();
      private final Multimap<jc, gst> b = ArrayListMultimap.create();

      public hng.a a(jc $$0, gst $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public hng.a a(gst $$0) {
         this.a.add($$0);
         return this;
      }

      private static hng a(List<gst> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<gst> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<gst> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<gst> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<gst> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<gst> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<gst> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<gst> $$15 = $$0.subList($$8, $$8 + $$7);
         return new hng($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public hng a() {
         ImmutableList<gst> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? hng.a : new hng($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<gst> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<gst> $$2 = this.b.get(jc.c);
            $$1.addAll($$2);
            Collection<gst> $$3 = this.b.get(jc.d);
            $$1.addAll($$3);
            Collection<gst> $$4 = this.b.get(jc.f);
            $$1.addAll($$4);
            Collection<gst> $$5 = this.b.get(jc.e);
            $$1.addAll($$5);
            Collection<gst> $$6 = this.b.get(jc.b);
            $$1.addAll($$6);
            Collection<gst> $$7 = this.b.get(jc.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}

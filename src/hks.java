import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hks implements hjz {
   public static final String a = "particle";
   private final List<gqk> b;
   private final Map<ja, List<gqk>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hhz g;
   private final gqu h;

   public hks(List<gqk> $$0, Map<ja, List<gqk>> $$1, boolean $$2, boolean $$3, boolean $$4, hhz $$5, gqu $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hjz a(List<gql> $$0, gqw $$1, hkt $$2, hkp $$3, boolean $$4, boolean $$5, boolean $$6, gqu $$7) {
      hhz $$8 = a($$2, $$1, "particle");
      hks.a $$9 = new hks.a($$4, $$5, $$6, $$7).a($$8);

      for (gql $$10 : $$0) {
         for (ja $$11 : $$10.c.keySet()) {
            gqm $$12 = $$10.c.get($$11);
            hhz $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(ja.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gqk a(gql $$0, gqm $$1, hhz $$2, ja $$3, hkp $$4) {
      return gqr.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hhz a(hkt $$0, gqw $$1, String $$2) {
      hkg $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gqk> a(@Nullable dzo $$0, @Nullable ja $$1, azt $$2) {
      return $$1 == null ? this.b : this.c.get($$1);
   }

   @Override
   public boolean a() {
      return this.d;
   }

   @Override
   public boolean b() {
      return this.e;
   }

   @Override
   public boolean c() {
      return this.f;
   }

   @Override
   public hhz d() {
      return this.g;
   }

   @Override
   public gqu e() {
      return this.h;
   }

   public static class a {
      private final Builder<gqk> a = ImmutableList.builder();
      private final Map<ja, Builder<gqk>> b = af.a(ja.class, $$0x -> ImmutableList.builder());
      private final boolean c;
      @Nullable
      private hhz d;
      private final boolean e;
      private final boolean f;
      private final gqu g;

      public a(boolean $$0, boolean $$1, boolean $$2, gqu $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
      }

      public hks.a a(ja $$0, gqk $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hks.a a(gqk $$0) {
         this.a.add($$0);
         return this;
      }

      public hks.a a(hhz $$0) {
         this.d = $$0;
         return this;
      }

      public hks.a a() {
         return this;
      }

      public hjz b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<ja, List<gqk>> $$0 = af.a(this.b, Builder::build);
            return new hks(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

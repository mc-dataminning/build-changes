import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hhl implements hgs {
   public static final String a = "particle";
   private final List<gnf> b;
   private final Map<jn, List<gnf>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hes g;
   private final gnp h;

   public hhl(List<gnf> $$0, Map<jn, List<gnf>> $$1, boolean $$2, boolean $$3, boolean $$4, hes $$5, gnp $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hgs a(List<gng> $$0, gnr $$1, hhm $$2, hhi $$3, boolean $$4, boolean $$5, boolean $$6, gnp $$7) {
      hes $$8 = a($$2, $$1, "particle");
      hhl.a $$9 = new hhl.a($$4, $$5, $$6, $$7).a($$8);

      for (gng $$10 : $$0) {
         for (jn $$11 : $$10.c.keySet()) {
            gnh $$12 = $$10.c.get($$11);
            hes $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jn.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gnf a(gng $$0, gnh $$1, hes $$2, jn $$3, hhi $$4) {
      return gnm.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hes a(hhm $$0, gnr $$1, String $$2) {
      hgz $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gnf> a(@Nullable dwx $$0, @Nullable jn $$1, azh $$2) {
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
   public hes d() {
      return this.g;
   }

   @Override
   public gnp e() {
      return this.h;
   }

   public static class a {
      private final Builder<gnf> a = ImmutableList.builder();
      private final EnumMap<jn, Builder<gnf>> b = Maps.newEnumMap(jn.class);
      private final boolean c;
      @Nullable
      private hes d;
      private final boolean e;
      private final boolean f;
      private final gnp g;

      public a(boolean $$0, boolean $$1, boolean $$2, gnp $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jn $$4 : jn.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hhl.a a(jn $$0, gnf $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hhl.a a(gnf $$0) {
         this.a.add($$0);
         return this;
      }

      public hhl.a a(hes $$0) {
         this.d = $$0;
         return this;
      }

      public hhl.a a() {
         return this;
      }

      public hgs b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jn, List<gnf>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hhl(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

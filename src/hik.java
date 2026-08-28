import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hik implements hhr {
   public static final String a = "particle";
   private final List<goe> b;
   private final Map<jn, List<goe>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hfr g;
   private final goo h;

   public hik(List<goe> $$0, Map<jn, List<goe>> $$1, boolean $$2, boolean $$3, boolean $$4, hfr $$5, goo $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hhr a(List<gof> $$0, goq $$1, hil $$2, hih $$3, boolean $$4, boolean $$5, boolean $$6, goo $$7) {
      hfr $$8 = a($$2, $$1, "particle");
      hik.a $$9 = new hik.a($$4, $$5, $$6, $$7).a($$8);

      for (gof $$10 : $$0) {
         for (jn $$11 : $$10.c.keySet()) {
            gog $$12 = $$10.c.get($$11);
            hfr $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jn.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static goe a(gof $$0, gog $$1, hfr $$2, jn $$3, hih $$4) {
      return gol.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hfr a(hil $$0, goq $$1, String $$2) {
      hhy $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<goe> a(@Nullable dxq $$0, @Nullable jn $$1, azh $$2) {
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
   public hfr d() {
      return this.g;
   }

   @Override
   public goo e() {
      return this.h;
   }

   public static class a {
      private final Builder<goe> a = ImmutableList.builder();
      private final Map<jn, Builder<goe>> b = af.a(jn.class, $$0x -> ImmutableList.builder());
      private final boolean c;
      @Nullable
      private hfr d;
      private final boolean e;
      private final boolean f;
      private final goo g;

      public a(boolean $$0, boolean $$1, boolean $$2, goo $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
      }

      public hik.a a(jn $$0, goe $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hik.a a(goe $$0) {
         this.a.add($$0);
         return this;
      }

      public hik.a a(hfr $$0) {
         this.d = $$0;
         return this;
      }

      public hik.a a() {
         return this;
      }

      public hhr b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jn, List<goe>> $$0 = af.a(this.b, Builder::build);
            return new hik(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class na implements mu {
   private final mv b;
   private final cpk c;
   private final cmm d;
   private final cps e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cpe.a<?> j;

   private na(mv $$0, cpk $$1, cth $$2, cps $$3, float $$4, int $$5, cpe.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cpe> na a(cps $$0, mv $$1, cth $$2, float $$3, int $$4, cpz<T> $$5, cpe.a<T> $$6) {
      return new na($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static na a(cps $$0, mv $$1, cth $$2, float $$3, int $$4) {
      return new na($$1, cpk.a, $$2, $$0, $$3, $$4, cpj::new);
   }

   public static na b(cps $$0, mv $$1, cth $$2, float $$3, int $$4) {
      return new na($$1, c($$2), $$2, $$0, $$3, $$4, cph::new);
   }

   public static na c(cps $$0, mv $$1, cth $$2, float $$3, int $$4) {
      return new na($$1, b($$2), $$2, $$0, $$3, $$4, cqk::new);
   }

   public static na d(cps $$0, mv $$1, cth $$2, float $$3, int $$4) {
      return new na($$1, cpk.a, $$2, $$0, $$3, $$4, cqo::new);
   }

   public na b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public na b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cmm a() {
      return this.d;
   }

   @Override
   public void a(mw $$0, ahd $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cpe $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cmr(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cpk b(cth $$0) {
      if ($$0.k().u()) {
         return cpk.a;
      } else {
         return $$0.k() instanceof ckk ? cpk.b : cpk.c;
      }
   }

   private static cpk c(cth $$0) {
      return $$0.k() instanceof ckk ? cpk.b : cpk.c;
   }

   private static cpk a(cpz<? extends cpe> $$0, cth $$1) {
      if ($$0 == cpz.p) {
         return b($$1);
      } else if ($$0 == cpz.q) {
         return c($$1);
      } else if ($$0 != cpz.r && $$0 != cpz.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cpk.a;
      }
   }

   private void a(ahd $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

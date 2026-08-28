import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ol implements of {
   private final og b;
   private final ded c;
   private final czw d;
   private final den e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final ddx.a<?> j;

   private ol(og $$0, ded $$1, djy $$2, den $$3, float $$4, int $$5, ddx.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends ddx> ol a(den $$0, og $$1, djy $$2, float $$3, int $$4, dfb<T> $$5, ddx.a<T> $$6) {
      return new ol($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ol a(den $$0, og $$1, djy $$2, float $$3, int $$4) {
      return new ol($$1, ded.a, $$2, $$0, $$3, $$4, dec::new);
   }

   public static ol b(den $$0, og $$1, djy $$2, float $$3, int $$4) {
      return new ol($$1, c($$2), $$2, $$0, $$3, $$4, dea::new);
   }

   public static ol c(den $$0, og $$1, djy $$2, float $$3, int $$4) {
      return new ol($$1, b($$2), $$2, $$0, $$3, $$4, dfl::new);
   }

   public static ol d(den $$0, og $$1, djy $$2, float $$3, int $$4) {
      return new ol($$1, ded.a, $$2, $$0, $$3, $$4, dfq::new);
   }

   public ol b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ol b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public czw a() {
      return this.d;
   }

   @Override
   public void a(oh $$0, alj<der<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      ddx $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new daa(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static ded b(djy $$0) {
      if ($$0.h().f().c(kl.v)) {
         return ded.a;
      } else {
         return $$0.h() instanceof cyi ? ded.b : ded.c;
      }
   }

   private static ded c(djy $$0) {
      return $$0.h() instanceof cyi ? ded.b : ded.c;
   }

   private static ded a(dfb<? extends ddx> $$0, djy $$1) {
      if ($$0 == dfb.o) {
         return b($$1);
      } else if ($$0 == dfb.p) {
         return c($$1);
      } else if ($$0 != dfb.q && $$0 != dfb.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ded.a;
      }
   }

   private void a(alj<der<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

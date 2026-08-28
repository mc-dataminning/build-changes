import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ol implements of {
   private final og b;
   private final den c;
   private final dag d;
   private final dex e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final deh.a<?> j;

   private ol(og $$0, den $$1, dki $$2, dex $$3, float $$4, int $$5, deh.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends deh> ol a(dex $$0, og $$1, dki $$2, float $$3, int $$4, dfl<T> $$5, deh.a<T> $$6) {
      return new ol($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ol a(dex $$0, og $$1, dki $$2, float $$3, int $$4) {
      return new ol($$1, den.a, $$2, $$0, $$3, $$4, dem::new);
   }

   public static ol b(dex $$0, og $$1, dki $$2, float $$3, int $$4) {
      return new ol($$1, c($$2), $$2, $$0, $$3, $$4, dek::new);
   }

   public static ol c(dex $$0, og $$1, dki $$2, float $$3, int $$4) {
      return new ol($$1, b($$2), $$2, $$0, $$3, $$4, dfv::new);
   }

   public static ol d(dex $$0, og $$1, dki $$2, float $$3, int $$4) {
      return new ol($$1, den.a, $$2, $$0, $$3, $$4, dga::new);
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
   public dag a() {
      return this.d;
   }

   @Override
   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      deh $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new dak(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static den b(dki $$0) {
      if ($$0.h().f().c(kl.v)) {
         return den.a;
      } else {
         return $$0.h() instanceof cys ? den.b : den.c;
      }
   }

   private static den c(dki $$0) {
      return $$0.h() instanceof cys ? den.b : den.c;
   }

   private static den a(dfl<? extends deh> $$0, dki $$1) {
      if ($$0 == dfl.o) {
         return b($$1);
      } else if ($$0 == dfl.p) {
         return c($$1);
      } else if ($$0 != dfl.q && $$0 != dfl.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return den.a;
      }
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

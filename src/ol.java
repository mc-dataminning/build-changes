import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ol implements of {
   private final og b;
   private final cyn c;
   private final cuc d;
   private final cyv e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyh.a<?> j;

   private ol(og $$0, cyn $$1, dbz $$2, cyv $$3, float $$4, int $$5, cyh.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyh> ol a(cyv $$0, og $$1, dbz $$2, float $$3, int $$4, cze<T> $$5, cyh.a<T> $$6) {
      return new ol($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ol a(cyv $$0, og $$1, dbz $$2, float $$3, int $$4) {
      return new ol($$1, cyn.a, $$2, $$0, $$3, $$4, cym::new);
   }

   public static ol b(cyv $$0, og $$1, dbz $$2, float $$3, int $$4) {
      return new ol($$1, c($$2), $$2, $$0, $$3, $$4, cyk::new);
   }

   public static ol c(cyv $$0, og $$1, dbz $$2, float $$3, int $$4) {
      return new ol($$1, b($$2), $$2, $$0, $$3, $$4, czp::new);
   }

   public static ol d(cyv $$0, og $$1, dbz $$2, float $$3, int $$4) {
      return new ol($$1, cyn.a, $$2, $$0, $$3, $$4, czt::new);
   }

   public ol b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ol b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cuc a() {
      return this.d;
   }

   @Override
   public void a(oh $$0, akt $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", df.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      cyh $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuh(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyn b(dbz $$0) {
      if ($$0.q().o().b(ke.t)) {
         return cyn.a;
      } else {
         return $$0.q() instanceof csc ? cyn.b : cyn.c;
      }
   }

   private static cyn c(dbz $$0) {
      return $$0.q() instanceof csc ? cyn.b : cyn.c;
   }

   private static cyn a(cze<? extends cyh> $$0, dbz $$1) {
      if ($$0 == cze.q) {
         return b($$1);
      } else if ($$0 == cze.r) {
         return c($$1);
      } else if ($$0 != cze.s && $$0 != cze.t) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyn.a;
      }
   }

   private void a(akt $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

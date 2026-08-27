import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nu implements no {
   private final np b;
   private final cuy c;
   private final cre d;
   private final cvg e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cus.a<?> j;

   private nu(np $$0, cuy $$1, cyw $$2, cvg $$3, float $$4, int $$5, cus.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.p();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cus> nu a(cvg $$0, np $$1, cyw $$2, float $$3, int $$4, cvn<T> $$5, cus.a<T> $$6) {
      return new nu($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static nu a(cvg $$0, np $$1, cyw $$2, float $$3, int $$4) {
      return new nu($$1, cuy.a, $$2, $$0, $$3, $$4, cux::new);
   }

   public static nu b(cvg $$0, np $$1, cyw $$2, float $$3, int $$4) {
      return new nu($$1, c($$2), $$2, $$0, $$3, $$4, cuv::new);
   }

   public static nu c(cvg $$0, np $$1, cyw $$2, float $$3, int $$4) {
      return new nu($$1, b($$2), $$2, $$0, $$3, $$4, cvy::new);
   }

   public static nu d(cvg $$0, np $$1, cyw $$2, float $$3, int $$4) {
      return new nu($$1, cuy.a, $$2, $$0, $$3, $$4, cwc::new);
   }

   public nu b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public nu b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cre a() {
      return this.d;
   }

   @Override
   public void a(nq $$0, ajt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cus $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new crj(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cuy b(cyw $$0) {
      if ($$0.p().y()) {
         return cuy.a;
      } else {
         return $$0.p() instanceof cph ? cuy.b : cuy.c;
      }
   }

   private static cuy c(cyw $$0) {
      return $$0.p() instanceof cph ? cuy.b : cuy.c;
   }

   private static cuy a(cvn<? extends cus> $$0, cyw $$1) {
      if ($$0 == cvn.p) {
         return b($$1);
      } else if ($$0 == cvn.q) {
         return c($$1);
      } else if ($$0 != cvn.r && $$0 != cvn.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cuy.a;
      }
   }

   private void a(ajt $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

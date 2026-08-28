import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cym c;
   private final cum d;
   private final cyu e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyg.a<?> j;

   private ou(op $$0, cym $$1, dbz $$2, cyu $$3, float $$4, int $$5, cyg.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyg> ou a(cyu $$0, op $$1, dbz $$2, float $$3, int $$4, czb<T> $$5, cyg.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cyu $$0, op $$1, dbz $$2, float $$3, int $$4) {
      return new ou($$1, cym.a, $$2, $$0, $$3, $$4, cyl::new);
   }

   public static ou b(cyu $$0, op $$1, dbz $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyj::new);
   }

   public static ou c(cyu $$0, op $$1, dbz $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czm::new);
   }

   public static ou d(cyu $$0, op $$1, dbz $$2, float $$3, int $$4) {
      return new ou($$1, cym.a, $$2, $$0, $$3, $$4, czq::new);
   }

   public ou b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cum a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cyg $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cur(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cym b(dbz $$0) {
      if ($$0.r().p().b(km.v)) {
         return cym.a;
      } else {
         return $$0.r() instanceof csp ? cym.b : cym.c;
      }
   }

   private static cym c(dbz $$0) {
      return $$0.r() instanceof csp ? cym.b : cym.c;
   }

   private static cym a(czb<? extends cyg> $$0, dbz $$1) {
      if ($$0 == czb.p) {
         return b($$1);
      } else if ($$0 == czb.q) {
         return c($$1);
      } else if ($$0 != czb.r && $$0 != czb.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cym.a;
      }
   }

   private void a(alf $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

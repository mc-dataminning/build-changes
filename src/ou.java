import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cyi c;
   private final cui d;
   private final cyq e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyc.a<?> j;

   private ou(op $$0, cyi $$1, dbv $$2, cyq $$3, float $$4, int $$5, cyc.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyc> ou a(cyq $$0, op $$1, dbv $$2, float $$3, int $$4, cyx<T> $$5, cyc.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cyq $$0, op $$1, dbv $$2, float $$3, int $$4) {
      return new ou($$1, cyi.a, $$2, $$0, $$3, $$4, cyh::new);
   }

   public static ou b(cyq $$0, op $$1, dbv $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyf::new);
   }

   public static ou c(cyq $$0, op $$1, dbv $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czi::new);
   }

   public static ou d(cyq $$0, op $$1, dbv $$2, float $$3, int $$4) {
      return new ou($$1, cyi.a, $$2, $$0, $$3, $$4, czm::new);
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
   public cui a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, ale $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cyc $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cun(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyi b(dbv $$0) {
      if ($$0.r().p().b(km.u)) {
         return cyi.a;
      } else {
         return $$0.r() instanceof csl ? cyi.b : cyi.c;
      }
   }

   private static cyi c(dbv $$0) {
      return $$0.r() instanceof csl ? cyi.b : cyi.c;
   }

   private static cyi a(cyx<? extends cyc> $$0, dbv $$1) {
      if ($$0 == cyx.p) {
         return b($$1);
      } else if ($$0 == cyx.q) {
         return c($$1);
      } else if ($$0 != cyx.r && $$0 != cyx.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyi.a;
      }
   }

   private void a(ale $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

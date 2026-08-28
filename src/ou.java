import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final czg c;
   private final cvg d;
   private final czp e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cza.a<?> j;

   private ou(op $$0, czg $$1, ddr $$2, czp $$3, float $$4, int $$5, cza.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cza> ou a(czp $$0, op $$1, ddr $$2, float $$3, int $$4, czy<T> $$5, cza.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(czp $$0, op $$1, ddr $$2, float $$3, int $$4) {
      return new ou($$1, czg.a, $$2, $$0, $$3, $$4, czf::new);
   }

   public static ou b(czp $$0, op $$1, ddr $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, czd::new);
   }

   public static ou c(czp $$0, op $$1, ddr $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, dak::new);
   }

   public static ou d(czp $$0, op $$1, ddr $$2, float $$3, int $$4) {
      return new ou($$1, czg.a, $$2, $$0, $$3, $$4, dap::new);
   }

   public ou b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cvg a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alb $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      cza $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cvl(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static czg b(ddr $$0) {
      if ($$0.r().p().b(kr.v)) {
         return czg.a;
      } else {
         return $$0.r() instanceof ctl ? czg.b : czg.c;
      }
   }

   private static czg c(ddr $$0) {
      return $$0.r() instanceof ctl ? czg.b : czg.c;
   }

   private static czg a(czy<? extends cza> $$0, ddr $$1) {
      if ($$0 == czy.o) {
         return b($$1);
      } else if ($$0 == czy.p) {
         return c($$1);
      } else if ($$0 != czy.q && $$0 != czy.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return czg.a;
      }
   }

   private void a(alb $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

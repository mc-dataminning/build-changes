import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cyl c;
   private final cul d;
   private final cyt e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyf.a<?> j;

   private ou(op $$0, cyl $$1, dby $$2, cyt $$3, float $$4, int $$5, cyf.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyf> ou a(cyt $$0, op $$1, dby $$2, float $$3, int $$4, cza<T> $$5, cyf.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cyt $$0, op $$1, dby $$2, float $$3, int $$4) {
      return new ou($$1, cyl.a, $$2, $$0, $$3, $$4, cyk::new);
   }

   public static ou b(cyt $$0, op $$1, dby $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyi::new);
   }

   public static ou c(cyt $$0, op $$1, dby $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czl::new);
   }

   public static ou d(cyt $$0, op $$1, dby $$2, float $$3, int $$4) {
      return new ou($$1, cyl.a, $$2, $$0, $$3, $$4, czp::new);
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
   public cul a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cyf $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuq(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyl b(dby $$0) {
      if ($$0.r().p().b(km.v)) {
         return cyl.a;
      } else {
         return $$0.r() instanceof cso ? cyl.b : cyl.c;
      }
   }

   private static cyl c(dby $$0) {
      return $$0.r() instanceof cso ? cyl.b : cyl.c;
   }

   private static cyl a(cza<? extends cyf> $$0, dby $$1) {
      if ($$0 == cza.p) {
         return b($$1);
      } else if ($$0 == cza.q) {
         return c($$1);
      } else if ($$0 != cza.r && $$0 != cza.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyl.a;
      }
   }

   private void a(alf $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

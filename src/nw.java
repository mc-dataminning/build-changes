import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nw implements nq {
   private final nr b;
   private final cvh c;
   private final crn d;
   private final cvp e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cvb.a<?> j;

   private nw(nr $$0, cvh $$1, czf $$2, cvp $$3, float $$4, int $$5, cvb.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.p();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cvb> nw a(cvp $$0, nr $$1, czf $$2, float $$3, int $$4, cvw<T> $$5, cvb.a<T> $$6) {
      return new nw($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static nw a(cvp $$0, nr $$1, czf $$2, float $$3, int $$4) {
      return new nw($$1, cvh.a, $$2, $$0, $$3, $$4, cvg::new);
   }

   public static nw b(cvp $$0, nr $$1, czf $$2, float $$3, int $$4) {
      return new nw($$1, c($$2), $$2, $$0, $$3, $$4, cve::new);
   }

   public static nw c(cvp $$0, nr $$1, czf $$2, float $$3, int $$4) {
      return new nw($$1, b($$2), $$2, $$0, $$3, $$4, cwh::new);
   }

   public static nw d(cvp $$0, nr $$1, czf $$2, float $$3, int $$4) {
      return new nw($$1, cvh.a, $$2, $$0, $$3, $$4, cwl::new);
   }

   public nw b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public nw b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public crn a() {
      return this.d;
   }

   @Override
   public void a(ns $$0, ajv $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cvb $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new crs(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cvh b(czf $$0) {
      if ($$0.p().y()) {
         return cvh.a;
      } else {
         return $$0.p() instanceof cpq ? cvh.b : cvh.c;
      }
   }

   private static cvh c(czf $$0) {
      return $$0.p() instanceof cpq ? cvh.b : cvh.c;
   }

   private static cvh a(cvw<? extends cvb> $$0, czf $$1) {
      if ($$0 == cvw.p) {
         return b($$1);
      } else if ($$0 == cvw.q) {
         return c($$1);
      } else if ($$0 != cvw.r && $$0 != cvw.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cvh.a;
      }
   }

   private void a(ajv $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

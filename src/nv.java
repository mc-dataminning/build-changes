import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nv implements nq {
   private final nr b;
   private final crn c;
   private final int d;
   private final iw<cvp> e = iw.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nv(nr $$0, czf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.p();
      this.d = $$2;
   }

   public static nv a(nr $$0, czf $$1) {
      return new nv($$0, $$1, 1);
   }

   public static nv a(nr $$0, czf $$1, int $$2) {
      return new nv($$0, $$1, $$2);
   }

   public nv a(avt<crn> $$0) {
      return this.a(cvp.a($$0));
   }

   public nv b(czf $$0) {
      return this.a($$0, 1);
   }

   public nv a(czf $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cvp.a($$0));
      }

      return this;
   }

   public nv a(cvp $$0) {
      return this.a($$0, 1);
   }

   public nv a(cvp $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public nv b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nv b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public crn a() {
      return this.c;
   }

   @Override
   public void a(ns $$0, ajv $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cwb $$3 = new cwb(Objects.requireNonNullElse(this.g, ""), nq.a(this.b), new crs(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajv $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

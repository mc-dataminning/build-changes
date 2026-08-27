import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nx implements nq {
   private final nr b;
   private final crn c;
   private final cvp d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cwg.a<?> h;

   public nx(nr $$0, cwg.a<?> $$1, cvp $$2, czf $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.p();
      this.d = $$2;
      this.e = $$4;
   }

   public static nx a(cvp $$0, nr $$1, czf $$2) {
      return new nx($$1, cwm::new, $$0, $$2, 1);
   }

   public static nx a(cvp $$0, nr $$1, czf $$2, int $$3) {
      return new nx($$1, cwm::new, $$0, $$2, $$3);
   }

   public nx b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nx b(@Nullable String $$0) {
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
      cwg $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new crs(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajv $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

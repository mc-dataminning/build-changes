import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nv implements no {
   private final np b;
   private final cre c;
   private final cvg d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cvx.a<?> h;

   public nv(np $$0, cvx.a<?> $$1, cvg $$2, cyw $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.p();
      this.d = $$2;
      this.e = $$4;
   }

   public static nv a(cvg $$0, np $$1, cyw $$2) {
      return new nv($$1, cwd::new, $$0, $$2, 1);
   }

   public static nv a(cvg $$0, np $$1, cyw $$2, int $$3) {
      return new nv($$1, cwd::new, $$0, $$2, $$3);
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
   public cre a() {
      return this.c;
   }

   @Override
   public void a(nq $$0, ajt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cvx $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new crj(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nf implements my {
   private final mz b;
   private final cou c;
   private final cry d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final csp.a<?> h;

   public nf(mz $$0, csp.a<?> $$1, cry $$2, cvm $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static nf a(cry $$0, mz $$1, cvm $$2) {
      return new nf($$1, csv::new, $$0, $$2, 1);
   }

   public static nf a(cry $$0, mz $$1, cvm $$2, int $$3) {
      return new nf($$1, csv::new, $$0, $$2, $$3);
   }

   public nf b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nf b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cou a() {
      return this.c;
   }

   @Override
   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      csp $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new coz(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(aiy $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

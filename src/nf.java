import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nf implements na {
   private final nb b;
   private final cpl c;
   private final int d;
   private final iu<csp> e = iu.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nf(nb $$0, cwd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.l();
      this.d = $$2;
   }

   public static nf a(nb $$0, cwd $$1) {
      return new nf($$0, $$1, 1);
   }

   public static nf a(nb $$0, cwd $$1, int $$2) {
      return new nf($$0, $$1, $$2);
   }

   public nf a(aut<cpl> $$0) {
      return this.a(csp.a($$0));
   }

   public nf b(cwd $$0) {
      return this.a($$0, 1);
   }

   public nf a(cwd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(csp.a($$0));
      }

      return this;
   }

   public nf a(csp $$0) {
      return this.a($$0, 1);
   }

   public nf a(csp $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
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
   public cpl a() {
      return this.c;
   }

   @Override
   public void a(nc $$0, ajc $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      ctb $$3 = new ctb(Objects.requireNonNullElse(this.g, ""), na.a(this.b), new cpq(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajc $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nh implements na {
   private final nb b;
   private final cpl c;
   private final csp d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final ctg.a<?> h;

   public nh(nb $$0, ctg.a<?> $$1, csp $$2, cwd $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.l();
      this.d = $$2;
      this.e = $$4;
   }

   public static nh a(csp $$0, nb $$1, cwd $$2) {
      return new nh($$1, ctm::new, $$0, $$2, 1);
   }

   public static nh a(csp $$0, nb $$1, cwd $$2, int $$3) {
      return new nh($$1, ctm::new, $$0, $$2, $$3);
   }

   public nh b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nh b(@Nullable String $$0) {
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
      ctg $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cpq(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajc $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

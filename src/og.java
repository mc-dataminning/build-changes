import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class og implements nz {
   private final oa b;
   private final cry c;
   private final cwd d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cwu.a<?> h;

   public og(oa $$0, cwu.a<?> $$1, cwd $$2, czt $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.p();
      this.d = $$2;
      this.e = $$4;
   }

   public static og a(cwd $$0, oa $$1, czt $$2) {
      return new og($$1, cxa::new, $$0, $$2, 1);
   }

   public static og a(cwd $$0, oa $$1, czt $$2, int $$3) {
      return new og($$1, cxa::new, $$0, $$2, $$3);
   }

   public og b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public og b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cry a() {
      return this.c;
   }

   @Override
   public void a(ob $$0, akf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cwu $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new csd(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akf $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

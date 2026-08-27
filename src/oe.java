import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oe implements nz {
   private final oa b;
   private final cry c;
   private final int d;
   private final je<cwd> e = je.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public oe(oa $$0, czt $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.p();
      this.d = $$2;
   }

   public static oe a(oa $$0, czt $$1) {
      return new oe($$0, $$1, 1);
   }

   public static oe a(oa $$0, czt $$1, int $$2) {
      return new oe($$0, $$1, $$2);
   }

   public oe a(awd<cry> $$0) {
      return this.a(cwd.a($$0));
   }

   public oe b(czt $$0) {
      return this.a($$0, 1);
   }

   public oe a(czt $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cwd.a($$0));
      }

      return this;
   }

   public oe a(cwd $$0) {
      return this.a($$0, 1);
   }

   public oe a(cwd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oe b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oe b(@Nullable String $$0) {
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
      cwp $$3 = new cwp(Objects.requireNonNullElse(this.g, ""), nz.a(this.b), new csd(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akf $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

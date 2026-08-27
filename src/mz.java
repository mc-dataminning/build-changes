import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class mz implements mu {
   private final mv b;
   private final cmm c;
   private final int d;
   private final iq<cps> e = iq.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public mz(mv $$0, cth $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static mz a(mv $$0, cth $$1) {
      return new mz($$0, $$1, 1);
   }

   public static mz a(mv $$0, cth $$1, int $$2) {
      return new mz($$0, $$1, $$2);
   }

   public mz a(asq<cmm> $$0) {
      return this.a(cps.a($$0));
   }

   public mz b(cth $$0) {
      return this.a($$0, 1);
   }

   public mz a(cth $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cps.a($$0));
      }

      return this;
   }

   public mz a(cps $$0) {
      return this.a($$0, 1);
   }

   public mz a(cps $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public mz b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mz b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cmm a() {
      return this.c;
   }

   @Override
   public void a(mw $$0, ahd $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqe $$3 = new cqe(Objects.requireNonNullElse(this.g, ""), mu.a(this.b), new cmr(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ahd $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

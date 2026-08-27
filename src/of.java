import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final cvv c;
   private final cry d;
   private final cwd e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cvp.a<?> j;

   private of(oa $$0, cvv $$1, czt $$2, cwd $$3, float $$4, int $$5, cvp.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.p();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cvp> of a(cwd $$0, oa $$1, czt $$2, float $$3, int $$4, cwk<T> $$5, cvp.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(cwd $$0, oa $$1, czt $$2, float $$3, int $$4) {
      return new of($$1, cvv.a, $$2, $$0, $$3, $$4, cvu::new);
   }

   public static of b(cwd $$0, oa $$1, czt $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, cvs::new);
   }

   public static of c(cwd $$0, oa $$1, czt $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, cwv::new);
   }

   public static of d(cwd $$0, oa $$1, czt $$2, float $$3, int $$4) {
      return new of($$1, cvv.a, $$2, $$0, $$3, $$4, cwz::new);
   }

   public of b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public of b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cry a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, akf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", db.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cvp $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new csd(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cvv b(czt $$0) {
      if ($$0.p().y()) {
         return cvv.a;
      } else {
         return $$0.p() instanceof cqb ? cvv.b : cvv.c;
      }
   }

   private static cvv c(czt $$0) {
      return $$0.p() instanceof cqb ? cvv.b : cvv.c;
   }

   private static cvv a(cwk<? extends cvp> $$0, czt $$1) {
      if ($$0 == cwk.p) {
         return b($$1);
      } else if ($$0 == cwk.q) {
         return c($$1);
      } else if ($$0 != cwk.r && $$0 != cwk.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cvv.a;
      }
   }

   private void a(akf $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

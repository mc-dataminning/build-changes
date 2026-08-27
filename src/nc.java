import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nc implements mw {
   private final mx b;
   private final cpr c;
   private final cmt d;
   private final cpz e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cpl.a<?> j;

   private nc(mx $$0, cpr $$1, cto $$2, cpz $$3, float $$4, int $$5, cpl.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cpl> nc a(cpz $$0, mx $$1, cto $$2, float $$3, int $$4, cqg<T> $$5, cpl.a<T> $$6) {
      return new nc($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static nc a(cpz $$0, mx $$1, cto $$2, float $$3, int $$4) {
      return new nc($$1, cpr.a, $$2, $$0, $$3, $$4, cpq::new);
   }

   public static nc b(cpz $$0, mx $$1, cto $$2, float $$3, int $$4) {
      return new nc($$1, c($$2), $$2, $$0, $$3, $$4, cpo::new);
   }

   public static nc c(cpz $$0, mx $$1, cto $$2, float $$3, int $$4) {
      return new nc($$1, b($$2), $$2, $$0, $$3, $$4, cqr::new);
   }

   public static nc d(cpz $$0, mx $$1, cto $$2, float $$3, int $$4) {
      return new nc($$1, cpr.a, $$2, $$0, $$3, $$4, cqv::new);
   }

   public nc b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public nc b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cmt a() {
      return this.d;
   }

   @Override
   public void a(my $$0, ahg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cpl $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cmy(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cpr b(cto $$0) {
      if ($$0.k().u()) {
         return cpr.a;
      } else {
         return $$0.k() instanceof ckr ? cpr.b : cpr.c;
      }
   }

   private static cpr c(cto $$0) {
      return $$0.k() instanceof ckr ? cpr.b : cpr.c;
   }

   private static cpr a(cqg<? extends cpl> $$0, cto $$1) {
      if ($$0 == cqg.p) {
         return b($$1);
      } else if ($$0 == cqg.q) {
         return c($$1);
      } else if ($$0 != cqg.r && $$0 != cqg.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cpr.a;
      }
   }

   private void a(ahg $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

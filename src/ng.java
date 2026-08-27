import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ng implements na {
   private final nb b;
   private final csh c;
   private final cpl d;
   private final csp e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final csb.a<?> j;

   private ng(nb $$0, csh $$1, cwd $$2, csp $$3, float $$4, int $$5, csb.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.l();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends csb> ng a(csp $$0, nb $$1, cwd $$2, float $$3, int $$4, csw<T> $$5, csb.a<T> $$6) {
      return new ng($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ng a(csp $$0, nb $$1, cwd $$2, float $$3, int $$4) {
      return new ng($$1, csh.a, $$2, $$0, $$3, $$4, csg::new);
   }

   public static ng b(csp $$0, nb $$1, cwd $$2, float $$3, int $$4) {
      return new ng($$1, c($$2), $$2, $$0, $$3, $$4, cse::new);
   }

   public static ng c(csp $$0, nb $$1, cwd $$2, float $$3, int $$4) {
      return new ng($$1, b($$2), $$2, $$0, $$3, $$4, cth::new);
   }

   public static ng d(csp $$0, nb $$1, cwd $$2, float $$3, int $$4) {
      return new ng($$1, csh.a, $$2, $$0, $$3, $$4, ctl::new);
   }

   public ng b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ng b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cpl a() {
      return this.d;
   }

   @Override
   public void a(nc $$0, ajc $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      csb $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cpq(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static csh b(cwd $$0) {
      if ($$0.l().v()) {
         return csh.a;
      } else {
         return $$0.l() instanceof cnl ? csh.b : csh.c;
      }
   }

   private static csh c(cwd $$0) {
      return $$0.l() instanceof cnl ? csh.b : csh.c;
   }

   private static csh a(csw<? extends csb> $$0, cwd $$1) {
      if ($$0 == csw.p) {
         return b($$1);
      } else if ($$0 == csw.q) {
         return c($$1);
      } else if ($$0 != csw.r && $$0 != csw.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return csh.a;
      }
   }

   private void a(ajc $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

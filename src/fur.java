import java.util.ArrayList;
import java.util.List;

public class fur implements fut {
   private static final alg a = alg.b("toast/recipe");
   private static final long e = 5000L;
   private static final wy f = wy.c("recipe.toast.title");
   private static final wy g = wy.c("recipe.toast.description");
   private final List<fur.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fut.a k = fut.a.b;
   private int l;

   private fur() {
   }

   @Override
   public fut.a a() {
      return this.k;
   }

   @Override
   public void a(fuu $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fut.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fut.a.b : fut.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(frv $$0, frt $$1, long $$2) {
      $$0.a(gqk::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fur.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(czd $$0, czd $$1) {
      this.h.add(new fur.a($$0, $$1));
      this.j = true;
   }

   public static void a(fuu $$0, dfa $$1) {
      fur $$2 = $$0.a(fur.class, b);
      if ($$2 == null) {
         $$2 = new fur();
         $$0.a($$2);
      }

      baz $$3 = dfh.a($$0.c().s);
      czd $$4 = $$1.e().b($$3);
      czd $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(czd a, czd b) {
   }
}

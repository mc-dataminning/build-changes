import java.util.ArrayList;
import java.util.List;

public class fvi implements fvk {
   private static final alg a = alg.b("toast/recipe");
   private static final long e = 5000L;
   private static final wy f = wy.c("recipe.toast.title");
   private static final wy g = wy.c("recipe.toast.description");
   private final List<fvi.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fvk.a k = fvk.a.b;
   private int l;

   private fvi() {
   }

   @Override
   public fvk.a a() {
      return this.k;
   }

   @Override
   public void a(fvl $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fvk.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fvk.a.b : fvk.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fsm $$0, fsk $$1, long $$2) {
      $$0.a(grc::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fvi.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(czn $$0, czn $$1) {
      this.h.add(new fvi.a($$0, $$1));
      this.j = true;
   }

   public static void a(fvl $$0, dfk $$1) {
      fvi $$2 = $$0.a(fvi.class, b);
      if ($$2 == null) {
         $$2 = new fvi();
         $$0.a($$2);
      }

      baz $$3 = dfr.a($$0.c().s);
      czn $$4 = $$1.e().b($$3);
      czn $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(czn a, czn b) {
   }
}

import java.util.ArrayList;
import java.util.List;

public class fwg implements fwi {
   private static final alr a = alr.b("toast/recipe");
   private static final long e = 5000L;
   private static final xg f = xg.c("recipe.toast.title");
   private static final xg g = xg.c("recipe.toast.description");
   private final List<fwg.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fwi.a k = fwi.a.b;
   private int l;

   private fwg() {
   }

   @Override
   public fwi.a a() {
      return this.k;
   }

   @Override
   public void a(fwj $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fwi.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fwi.a.b : fwi.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(ftk $$0, fti $$1, long $$2) {
      $$0.a(gry::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fwg.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(dak $$0, dak $$1) {
      this.h.add(new fwg.a($$0, $$1));
      this.j = true;
   }

   public static void a(fwj $$0, dgh $$1) {
      fwg $$2 = $$0.a(fwg.class, b);
      if ($$2 == null) {
         $$2 = new fwg();
         $$0.a($$2);
      }

      bbm $$3 = dgo.a($$0.c().s);
      dak $$4 = $$1.e().b($$3);
      dak $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(dak a, dak b) {
   }
}

import java.util.ArrayList;
import java.util.List;

public class fwv implements fwx {
   private static final alk a = alk.b("toast/recipe");
   private static final long e = 5000L;
   private static final xc f = xc.c("recipe.toast.title");
   private static final xc g = xc.c("recipe.toast.description");
   private final List<fwv.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fwx.a k = fwx.a.b;
   private int l;

   private fwv() {
   }

   @Override
   public fwx.a a() {
      return this.k;
   }

   @Override
   public void a(fwy $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fwx.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fwx.a.b : fwx.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(ftz $$0, ftx $$1, long $$2) {
      $$0.a(gsn::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fwv.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(daa $$0, daa $$1) {
      this.h.add(new fwv.a($$0, $$1));
      this.j = true;
   }

   public static void a(fwy $$0, dfx $$1) {
      fwv $$2 = $$0.a(fwv.class, b);
      if ($$2 == null) {
         $$2 = new fwv();
         $$0.a($$2);
      }

      bbd $$3 = dge.a($$0.c().s);
      daa $$4 = $$1.e().b($$3);
      daa $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(daa a, daa b) {
   }
}

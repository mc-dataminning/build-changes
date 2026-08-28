import java.util.ArrayList;
import java.util.List;

public class fwt implements fwv {
   private static final ali a = ali.b("toast/recipe");
   private static final long e = 5000L;
   private static final xa f = xa.c("recipe.toast.title");
   private static final xa g = xa.c("recipe.toast.description");
   private final List<fwt.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fwv.a k = fwv.a.b;
   private int l;

   private fwt() {
   }

   @Override
   public fwv.a a() {
      return this.k;
   }

   @Override
   public void a(fww $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fwv.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fwv.a.b : fwv.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(ftx $$0, ftv $$1, long $$2) {
      $$0.a(gsl::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fwt.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(czy $$0, czy $$1) {
      this.h.add(new fwt.a($$0, $$1));
      this.j = true;
   }

   public static void a(fww $$0, dfv $$1) {
      fwt $$2 = $$0.a(fwt.class, b);
      if ($$2 == null) {
         $$2 = new fwt();
         $$0.a($$2);
      }

      bbb $$3 = dgc.a($$0.c().s);
      czy $$4 = $$1.e().b($$3);
      czy $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(czy a, czy b) {
   }
}

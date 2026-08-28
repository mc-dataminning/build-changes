import java.util.ArrayList;
import java.util.List;

public class fuk implements fum {
   private static final alg a = alg.b("toast/recipe");
   private static final long e = 5000L;
   private static final wy f = wy.c("recipe.toast.title");
   private static final wy g = wy.c("recipe.toast.description");
   private final List<fuk.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fum.a k = fum.a.b;
   private int l;

   private fuk() {
   }

   @Override
   public fum.a a() {
      return this.k;
   }

   @Override
   public void a(fun $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fum.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fum.a.b : fum.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fro $$0, frm $$1, long $$2) {
      $$0.a(gqc::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fuk.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cyy $$0, cyy $$1) {
      this.h.add(new fuk.a($$0, $$1));
      this.j = true;
   }

   public static void a(fun $$0, dev $$1) {
      fuk $$2 = $$0.a(fuk.class, b);
      if ($$2 == null) {
         $$2 = new fuk();
         $$0.a($$2);
      }

      baz $$3 = dfc.a($$0.c().s);
      cyy $$4 = $$1.e().b($$3);
      cyy $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cyy a, cyy b) {
   }
}

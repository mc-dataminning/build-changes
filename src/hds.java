import javax.annotation.Nullable;

public class hds implements hdx {
   private static final int a = 6000;
   private static final xh b = xh.c("tutorial.find_tree.title");
   private static final xh c = xh.c("tutorial.find_tree.description");
   private final hdw d;
   @Nullable
   private fnl e;
   private int f;

   public hds(hdw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdy.f);
      } else {
         if (this.f == 1) {
            ggs $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hdy.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fnl(fnl.a.c, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void a(gbx $$0, ezf $$1) {
      if ($$1.d() == ezf.a.b) {
         dvd $$2 = $$0.a_(((ezd)$$1).b());
         if ($$2.a(awz.ak)) {
            this.d.a(hdy.c);
         }
      }
   }

   @Override
   public void a(cvx $$0) {
      if ($$0.a(axi.aN)) {
         this.d.a(hdy.e);
      }
   }

   private static boolean b(ggs $$0) {
      return $$0.gk().a_($$0x -> $$0x.a(axi.aN));
   }

   public static boolean a(ggs $$0) {
      for (jp<dhy> $$1 : lx.e.c(awz.ak)) {
         dhy $$2 = $$1.a();
         if ($$0.i().a(awu.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

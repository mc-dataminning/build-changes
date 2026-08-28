import javax.annotation.Nullable;

public class hdd implements hdi {
   private static final int a = 6000;
   private static final xe b = xe.c("tutorial.find_tree.title");
   private static final xe c = xe.c("tutorial.find_tree.description");
   private final hdh d;
   @Nullable
   private fna e;
   private int f;

   public hdd(hdh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdj.f);
      } else {
         if (this.f == 1) {
            ggh $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hdj.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fna(fna.a.c, b, c, false);
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
   public void a(gbm $$0, eyu $$1) {
      if ($$1.d() == eyu.a.b) {
         dus $$2 = $$0.a_(((eys)$$1).b());
         if ($$2.a(awv.ak)) {
            this.d.a(hdj.c);
         }
      }
   }

   @Override
   public void a(cvs $$0) {
      if ($$0.a(axe.aM)) {
         this.d.a(hdj.e);
      }
   }

   private static boolean b(ggh $$0) {
      return $$0.gd().a_($$0x -> $$0x.a(axe.aM));
   }

   public static boolean a(ggh $$0) {
      for (jo<dhm> $$1 : lv.e.c(awv.ak)) {
         dhm $$2 = $$1.a();
         if ($$0.i().a(awq.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

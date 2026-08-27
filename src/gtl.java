public class gtl implements gtr {
   private static final int a = 1200;
   private static final wx b = wx.c("tutorial.craft_planks.title");
   private static final wx c = wx.c("tutorial.craft_planks.description");
   private final gtq d;
   private fik e;
   private int f;

   public gtl(gtq $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gts.f);
      } else {
         if (this.f == 1) {
            gbm $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awe.b)) {
                  this.d.a(gts.f);
                  return;
               }

               if (a($$0, awe.b)) {
                  this.d.a(gts.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fik(fik.a.e, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(cto $$0) {
      if ($$0.a(awe.b)) {
         this.d.a(gts.f);
      }
   }

   public static boolean a(gbm $$0, awl<ctj> $$1) {
      for (ix<ctj> $$2 : le.h.c($$1)) {
         if ($$0.j().a(avr.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}

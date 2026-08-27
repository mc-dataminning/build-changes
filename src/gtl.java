public class gtl implements gtr {
   private static final int a = 1200;
   private static final wx b = wx.c("tutorial.craft_planks.title");
   private static final wx c = wx.c("tutorial.craft_planks.description");
   private final gtq d;
   private fil e;
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
               if ($$0.gc().a(awf.b)) {
                  this.d.a(gts.f);
                  return;
               }

               if (a($$0, awf.b)) {
                  this.d.a(gts.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fil(fil.a.e, b, c, false);
            this.d.e().ax().a(this.e);
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
   public void a(ctq $$0) {
      if ($$0.a(awf.b)) {
         this.d.a(gts.f);
      }
   }

   public static boolean a(gbm $$0, awm<ctl> $$1) {
      for (ix<ctl> $$2 : le.h.c($$1)) {
         if ($$0.j().a(avs.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}

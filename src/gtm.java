public class gtm implements gtr {
   private static final int a = 6000;
   private static final wx b = wx.c("tutorial.find_tree.title");
   private static final wx c = wx.c("tutorial.find_tree.description");
   private final gtq d;
   private fik e;
   private int f;

   public gtm(gtq $$0) {
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
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gts.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fik(fik.a.c, b, c, false);
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
   public void a(fwr $$0, eui $$1) {
      if ($$1.c() == eui.a.b) {
         drb $$2 = $$0.a_(((eug)$$1).a());
         if ($$2.a(avw.aj)) {
            this.d.a(gts.c);
         }
      }
   }

   @Override
   public void a(cto $$0) {
      if ($$0.a(awe.aM)) {
         this.d.a(gts.e);
      }
   }

   private static boolean b(gbm $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awe.aM));
   }

   public static boolean a(gbm $$0) {
      for (ix<ddy> $$1 : le.e.c(avw.aj)) {
         ddy $$2 = $$1.a();
         if ($$0.j().a(avr.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

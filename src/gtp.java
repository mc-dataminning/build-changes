public class gtp implements gtr {
   private static final int a = 600;
   private static final wx b = wx.c("tutorial.punch_tree.title");
   private static final wx c = wx.a("tutorial.punch_tree.description", gtq.a("attack"));
   private final gtq d;
   private fil e;
   private int f;
   private int g;

   public gtp(gtq $$0) {
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
               if ($$0.gc().a(awf.r)) {
                  this.d.a(gts.e);
                  return;
               }

               if (gtm.a($$0)) {
                  this.d.a(gts.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fil(fil.a.c, b, c, true);
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
   public void a(fwr $$0, io $$1, drd $$2, float $$3) {
      boolean $$4 = $$2.a(avx.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gts.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(ctq $$0) {
      if ($$0.a(awf.r)) {
         this.d.a(gts.e);
      }
   }
}

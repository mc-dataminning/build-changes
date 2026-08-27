public class gmq implements gmw {
   private static final int a = 1200;
   private static final vq b = vq.c("tutorial.craft_planks.title");
   private static final vq c = vq.c("tutorial.craft_planks.description");
   private final gmv d;
   private fbz e;
   private int f;

   public gmq(gmv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmx.f);
      } else {
         if (this.f == 1) {
            fuv $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(aui.b)) {
                  this.d.a(gmx.f);
                  return;
               }

               if (a($$0, aui.b)) {
                  this.d.a(gmx.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fbz(fbz.a.e, b, c, false);
            this.d.e().az().a(this.e);
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
   public void a(cpd $$0) {
      if ($$0.a(aui.b)) {
         this.d.a(gmx.f);
      }
   }

   public static boolean a(fuv $$0, aup<coy> $$1) {
      for (ij<coy> $$2 : kf.h.c($$1)) {
         if ($$0.j().a(atv.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}

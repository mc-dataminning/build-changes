public class grc implements gre {
   private static final int a = 600;
   private static final wg b = wg.c("tutorial.punch_tree.title");
   private static final wg c = wg.a("tutorial.punch_tree.description", grd.a("attack"));
   private final grd d;
   private fga e;
   private int f;
   private int g;

   public grc(grd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(grf.f);
      } else {
         if (this.f == 1) {
            fzb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(avk.r)) {
                  this.d.a(grf.e);
                  return;
               }

               if (gqz.a($$0)) {
                  this.d.a(grf.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fga(fga.a.c, b, c, true);
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
   public void a(fuh $$0, ib $$1, doz $$2, float $$3) {
      boolean $$4 = $$2.a(avc.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(grf.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(crj $$0) {
      if ($$0.a(avk.r)) {
         this.d.a(grf.e);
      }
   }
}

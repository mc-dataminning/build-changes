public class gwa implements gwc {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.punch_tree.title");
   private static final wy c = wy.a("tutorial.punch_tree.description", gwb.a("attack"));
   private final gwb d;
   private fkr e;
   private int f;
   private int g;

   public gwa(gwb $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwd.f);
      } else {
         if (this.f == 1) {
            gdv $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(awm.r)) {
                  this.d.a(gwd.e);
                  return;
               }

               if (gvx.a($$0)) {
                  this.d.a(gwd.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fkr(fkr.a.c, b, c, true);
            this.d.e().aw().a(this.e);
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
   public void a(fyz $$0, jd $$1, dta $$2, float $$3) {
      boolean $$4 = $$2.a(awd.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gwd.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuo $$0) {
      if ($$0.a(awm.r)) {
         this.d.a(gwd.e);
      }
   }
}

public class gmm implements gmo {
   private static final int a = 600;
   private static final vq b = vq.c("tutorial.punch_tree.title");
   private static final vq c = vq.a("tutorial.punch_tree.description", gmn.a("attack"));
   private final gmn d;
   private fbs e;
   private int f;
   private int g;

   public gmm(gmn $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmp.f);
      } else {
         if (this.f == 1) {
            fun $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(auh.r)) {
                  this.d.a(gmp.e);
                  return;
               }

               if (gmj.a($$0)) {
                  this.d.a(gmp.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fbs(fbs.a.c, b, c, true);
            this.d.e().ay().a(this.e);
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
   public void a(fpx $$0, hz $$1, dlf $$2, float $$3) {
      boolean $$4 = $$2.a(atz.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gmp.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(coz $$0) {
      if ($$0.a(auh.r)) {
         this.d.a(gmp.e);
      }
   }
}

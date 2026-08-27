public class gmu implements gmw {
   private static final int a = 600;
   private static final vq b = vq.c("tutorial.punch_tree.title");
   private static final vq c = vq.a("tutorial.punch_tree.description", gmv.a("attack"));
   private final gmv d;
   private fbz e;
   private int f;
   private int g;

   public gmu(gmv $$0) {
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
               if ($$0.fT().a(aui.r)) {
                  this.d.a(gmx.e);
                  return;
               }

               if (gmr.a($$0)) {
                  this.d.a(gmx.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fbz(fbz.a.c, b, c, true);
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
   public void a(fqe $$0, hz $$1, dlj $$2, float $$3) {
      boolean $$4 = $$2.a(aua.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gmx.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cpd $$0) {
      if ($$0.a(aui.r)) {
         this.d.a(gmx.e);
      }
   }
}

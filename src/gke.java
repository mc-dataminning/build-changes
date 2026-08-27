public class gke implements gkg {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.punch_tree.title");
   private static final vf c = vf.a("tutorial.punch_tree.description", gkf.a("attack"));
   private final gkf d;
   private ezo e;
   private int f;
   private int g;

   public gke(gkf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkh.f);
      } else {
         if (this.f == 1) {
            fsh $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(aso.r)) {
                  this.d.a(gkh.e);
                  return;
               }

               if (gkb.a($$0)) {
                  this.d.a(gkh.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new ezo(ezo.a.c, b, c, true);
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
   public void a(fnq $$0, hx $$1, djg $$2, float $$3) {
      boolean $$4 = $$2.a(asg.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gkh.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cmx $$0) {
      if ($$0.a(aso.r)) {
         this.d.a(gkh.e);
      }
   }
}

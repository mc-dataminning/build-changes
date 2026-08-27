public class gss implements gsu {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.punch_tree.title");
   private static final wu c = wu.a("tutorial.punch_tree.description", gst.a("attack"));
   private final gst d;
   private fhp e;
   private int f;
   private int g;

   public gss(gst $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsv.f);
      } else {
         if (this.f == 1) {
            gaq $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(avz.r)) {
                  this.d.a(gsv.e);
                  return;
               }

               if (gsp.a($$0)) {
                  this.d.a(gsv.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fhp(fhp.a.c, b, c, true);
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
   public void a(fvw $$0, in $$1, dqh $$2, float $$3) {
      boolean $$4 = $$2.a(avr.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gsv.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(csz $$0) {
      if ($$0.a(avz.r)) {
         this.d.a(gsv.e);
      }
   }
}

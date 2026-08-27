public class gku implements gkw {
   private static final int a = 600;
   private static final vg b = vg.c("tutorial.punch_tree.title");
   private static final vg c = vg.a("tutorial.punch_tree.description", gkv.a("attack"));
   private final gkv d;
   private fab e;
   private int f;
   private int g;

   public gku(gkv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkx.f);
      } else {
         if (this.f == 1) {
            fsv $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asq.r)) {
                  this.d.a(gkx.e);
                  return;
               }

               if (gkr.a($$0)) {
                  this.d.a(gkx.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fab(fab.a.c, b, c, true);
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
   public void a(foe $$0, hx $$1, djp $$2, float $$3) {
      boolean $$4 = $$2.a(asi.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gkx.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cng $$0) {
      if ($$0.a(asq.r)) {
         this.d.a(gkx.e);
      }
   }
}

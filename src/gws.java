public class gws implements gwu {
   private static final int a = 600;
   private static final xe b = xe.c("tutorial.punch_tree.title");
   private static final xe c = xe.a("tutorial.punch_tree.description", gwt.a("attack"));
   private final gwt d;
   private fky e;
   private int f;
   private int g;

   public gws(gwt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwv.f);
      } else {
         if (this.f == 1) {
            gei $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gl().a(awm.r)) {
                  this.d.a(gwv.e);
                  return;
               }

               if (gwp.a($$0)) {
                  this.d.a(gwv.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fky(fky.a.c, b, c, true);
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
   public void a(fzn $$0, ir $$1, dtc $$2, float $$3) {
      boolean $$4 = $$2.a(awe.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gwv.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuh $$0) {
      if ($$0.a(awm.r)) {
         this.d.a(gwv.e);
      }
   }
}

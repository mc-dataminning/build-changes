public class ghi implements ghk {
   private static final int a = 600;
   private static final ur b = ur.c("tutorial.punch_tree.title");
   private static final ur c = ur.a("tutorial.punch_tree.description", ghj.a("attack"));
   private final ghj d;
   private exj e;
   private int f;
   private int g;

   public ghi(ghj $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghl.f);
      } else {
         if (this.f == 1) {
            fpw $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(aro.r)) {
                  this.d.a(ghl.e);
                  return;
               }

               if (ghf.a($$0)) {
                  this.d.a(ghl.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new exj(exj.a.c, b, c, true);
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
   public void a(flj $$0, ht $$1, dhi $$2, float $$3) {
      boolean $$4 = $$2.a(arg.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(ghl.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(clj $$0) {
      if ($$0.a(aro.r)) {
         this.d.a(ghl.e);
      }
   }
}

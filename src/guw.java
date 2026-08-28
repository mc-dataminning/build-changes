public class guw implements guy {
   private static final int a = 600;
   private static final xo b = xo.c("tutorial.punch_tree.title");
   private static final xo c = xo.a("tutorial.punch_tree.description", gux.a("attack"));
   private final gux d;
   private fjo e;
   private int f;
   private int g;

   public guw(gux $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guz.f);
      } else {
         if (this.f == 1) {
            gcp $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awx.r)) {
                  this.d.a(guz.e);
                  return;
               }

               if (gut.a($$0)) {
                  this.d.a(guz.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fjo(fjo.a.c, b, c, true);
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
   public void a(fxu $$0, iz $$1, dsb $$2, float $$3) {
      boolean $$4 = $$2.a(awo.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(guz.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuo $$0) {
      if ($$0.a(awx.r)) {
         this.d.a(guz.e);
      }
   }
}

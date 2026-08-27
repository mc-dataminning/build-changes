public class gns implements gnu {
   private static final int a = 600;
   private static final vs b = vs.c("tutorial.punch_tree.title");
   private static final vs c = vs.a("tutorial.punch_tree.description", gnt.a("attack"));
   private final gnt d;
   private fcv e;
   private int f;
   private int g;

   public gns(gnt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gnv.f);
      } else {
         if (this.f == 1) {
            fvs $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fV().a(aum.r)) {
                  this.d.a(gnv.e);
                  return;
               }

               if (gnp.a($$0)) {
                  this.d.a(gnv.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fcv(fcv.a.c, b, c, true);
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
   public void a(fra $$0, ib $$1, dme $$2, float $$3) {
      boolean $$4 = $$2.a(aue.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gnv.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cpq $$0) {
      if ($$0.a(aum.r)) {
         this.d.a(gnv.e);
      }
   }
}

public class hke implements hjz {
   private final gmw a;
   private boolean b;
   private boolean c = true;

   public hke(gmw $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dhp $$0 = this.a.dV();
      dym $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dkw.nF)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dkw.nF) && !this.a.U_()) {
            boolean $$2 = $$1.c(dlb.b);
            if ($$2) {
               this.a.a(awk.db, 1.0F, 1.0F);
            } else {
               this.a.a(awk.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

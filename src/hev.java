public class hev implements heq {
   private final gkf a;
   private boolean b;
   private boolean c = true;

   public hev(gkf $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dhh $$0 = this.a.dV();
      dxu $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dkn.ny)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dkn.ny) && !this.a.aa_()) {
            boolean $$2 = $$1.c(dks.b);
            if ($$2) {
               this.a.a(axf.db, 1.0F, 1.0F);
            } else {
               this.a.a(axf.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

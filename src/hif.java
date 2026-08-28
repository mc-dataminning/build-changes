public class hif implements hia {
   private final gkx a;
   private boolean b;
   private boolean c = true;

   public hif(gkx $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dgj $$0 = this.a.dV();
      dwy $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(djp.nF)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(djp.nF) && !this.a.Z_()) {
            boolean $$2 = $$1.c(dju.b);
            if ($$2) {
               this.a.a(awa.db, 1.0F, 1.0F);
            } else {
               this.a.a(awa.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

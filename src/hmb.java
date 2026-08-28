public class hmb implements hlw {
   private final gop a;
   private boolean b;
   private boolean c = true;

   public hmb(gop $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      div $$0 = this.a.dV();
      dzz $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dmc.nG)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dmc.nG) && !this.a.U_()) {
            boolean $$2 = $$1.c(dmh.b);
            if ($$2) {
               this.a.a(awn.db, 1.0F, 1.0F);
            } else {
               this.a.a(awn.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

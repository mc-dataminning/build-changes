public class ghc implements ggx {
   private final fsb a;
   private boolean b;
   private boolean c = true;

   public ghc(fsb $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cti $$0 = this.a.dM();
      dja $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cwl.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cwl.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cwp.b);
            if ($$2) {
               this.a.a(arm.cD, 1.0F, 1.0F);
            } else {
               this.a.a(arm.cB, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

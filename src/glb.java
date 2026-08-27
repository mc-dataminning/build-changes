public class glb implements gkw {
   private final fvs a;
   private boolean b;
   private boolean c = true;

   public glb(fvs $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cwe $$0 = this.a.dJ();
      dme $$1 = $$0.c(this.a.cE().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(czh.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(czh.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(czl.b);
            if ($$2) {
               this.a.a(atp.cT, 1.0F, 1.0F);
            } else {
               this.a.a(atp.cR, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

public class fxn implements fxi {
   private final fiy a;
   private boolean b;
   private boolean c = true;

   public fxn(fiy $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cmm $$0 = this.a.dI();
      dcb $$1 = $$0.c(this.a.cE().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cpo.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cpo.nd) && !this.a.G_()) {
            boolean $$2 = $$1.c(cps.a);
            if ($$2) {
               this.a.a(amh.cu, 1.0F, 1.0F);
            } else {
               this.a.a(amh.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

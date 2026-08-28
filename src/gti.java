public class gti implements gtd {
   private final gdv a;
   private boolean b;
   private boolean c = true;

   public gti(gdv $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dcu $$0 = this.a.dQ();
      dta $$1 = $$0.c(this.a.cL().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfy.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfy.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dgc.b);
            if ($$2) {
               this.a.a(avo.db, 1.0F, 1.0F);
            } else {
               this.a.a(avo.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

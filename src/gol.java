public class gol implements gog {
   private final fzb a;
   private boolean b;
   private boolean c = true;

   public gol(fzb $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cyx $$0 = this.a.dM();
      doz $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dca.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dca.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dce.b);
            if ($$2) {
               this.a.a(aum.db, 1.0F, 1.0F);
            } else {
               this.a.a(aum.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

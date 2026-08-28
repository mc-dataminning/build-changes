public class grx implements grs {
   private final gcl a;
   private boolean b;
   private boolean c = true;

   public grx(gcl $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dbt $$0 = this.a.dP();
      drx $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dew.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dew.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfa.b);
            if ($$2) {
               this.a.a(avw.db, 1.0F, 1.0F);
            } else {
               this.a.a(avw.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

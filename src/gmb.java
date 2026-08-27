public class gmb implements glw {
   private final fws a;
   private boolean b;
   private boolean c = true;

   public gmb(fws $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cwz $$0 = this.a.dM();
      dmz $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dac.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dac.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dag.b);
            if ($$2) {
               this.a.a(aty.cW, 1.0F, 1.0F);
            } else {
               this.a.a(aty.cU, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

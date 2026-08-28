public class gsc implements grx {
   private final gcq a;
   private boolean b;
   private boolean c = true;

   public gsc(gcq $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dby $$0 = this.a.dP();
      dsc $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfb.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfb.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dff.b);
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

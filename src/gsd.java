public class gsd implements gry {
   private final gcr a;
   private boolean b;
   private boolean c = true;

   public gsd(gcr $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dbz $$0 = this.a.dP();
      dsd $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfc.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfc.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfg.b);
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

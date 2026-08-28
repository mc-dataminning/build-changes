public class hap implements hak {
   private final ggh a;
   private boolean b;
   private boolean c = true;

   public hap(ggh $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dej $$0 = this.a.dS();
      dus $$1 = $$0.c(this.a.cO().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dho.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dho.nd) && !this.a.Q_()) {
            boolean $$2 = $$1.c(dhs.b);
            if ($$2) {
               this.a.a(awg.db, 1.0F, 1.0F);
            } else {
               this.a.a(awg.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

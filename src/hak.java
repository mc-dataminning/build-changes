public class hak implements haf {
   private final ggc a;
   private boolean b;
   private boolean c = true;

   public hak(ggc $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      deg $$0 = this.a.dS();
      duo $$1 = $$0.c(this.a.cO().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dhl.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dhl.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(dhp.b);
            if ($$2) {
               this.a.a(awe.db, 1.0F, 1.0F);
            } else {
               this.a.a(awe.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

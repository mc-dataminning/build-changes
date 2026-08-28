public class hoc implements hnx {
   private final gqm a;
   private boolean b;
   private boolean c = true;

   public hoc(gqm $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dkj $$0 = this.a.dV();
      ebq $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dnq.nJ)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dnq.nJ) && !this.a.aa_()) {
            boolean $$2 = $$1.c(dnv.b);
            if ($$2) {
               this.a.a(awy.db, 1.0F, 1.0F);
            } else {
               this.a.a(awy.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

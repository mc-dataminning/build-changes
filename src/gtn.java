public class gtn implements gti {
   private final gdz a;
   private boolean b;
   private boolean c = true;

   public gtn(gdz $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dcw $$0 = this.a.dP();
      dtc $$1 = $$0.c(this.a.cL().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dga.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dga.nd) && !this.a.R_()) {
            boolean $$2 = $$1.c(dge.b);
            if ($$2) {
               this.a.a(avp.db, 1.0F, 1.0F);
            } else {
               this.a.a(avp.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

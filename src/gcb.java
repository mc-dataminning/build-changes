public class gcb implements gbw {
   private final fng a;
   private boolean b;
   private boolean c = true;

   public gcb(fng $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cpv $$0 = this.a.dL();
      dfj $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(csw.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(csw.nd) && !this.a.M_()) {
            boolean $$2 = $$1.c(cta.a);
            if ($$2) {
               this.a.a(ape.cu, 1.0F, 1.0F);
            } else {
               this.a.a(ape.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

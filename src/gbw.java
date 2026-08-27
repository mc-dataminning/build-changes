public class gbw implements gbr {
   private final fnb a;
   private boolean b;
   private boolean c = true;

   public gbw(fnb $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cpq $$0 = this.a.dK();
      dfe $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(csr.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(csr.nd) && !this.a.G_()) {
            boolean $$2 = $$1.c(csv.a);
            if ($$2) {
               this.a.a(aoz.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aoz.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

public class ghn implements ghi {
   private final fsh a;
   private boolean b;
   private boolean c = true;

   public ghn(fsh $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cto $$0 = this.a.dM();
      djg $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cwr.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cwr.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cwv.b);
            if ($$2) {
               this.a.a(arr.cD, 1.0F, 1.0F);
            } else {
               this.a.a(arr.cB, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

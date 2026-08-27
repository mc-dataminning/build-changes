public class gbx implements gbs {
   private final fnc a;
   private boolean b;
   private boolean c = true;

   public gbx(fnc $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cqb $$0 = this.a.dL();
      dfd $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cte.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cte.nd) && !this.a.M_()) {
            boolean $$2 = $$1.c(cti.b);
            if ($$2) {
               this.a.a(apg.cu, 1.0F, 1.0F);
            } else {
               this.a.a(apg.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

public class gew implements ger {
   private final fqb a;
   private boolean b;
   private boolean c = true;

   public gew(fqb $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      csf $$0 = this.a.dN();
      dhn $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cvh.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cvh.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cvl.b);
            if ($$2) {
               this.a.a(aqv.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aqv.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

public class ghp implements ghk {
   private final fsj a;
   private boolean b;
   private boolean c = true;

   public ghp(fsj $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      ctp $$0 = this.a.dM();
      djh $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cws.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cws.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cww.b);
            if ($$2) {
               this.a.a(ars.cD, 1.0F, 1.0F);
            } else {
               this.a.a(ars.cB, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

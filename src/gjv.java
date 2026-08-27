public class gjv implements gjq {
   private final fun a;
   private boolean b;
   private boolean c = true;

   public gjv(fun $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cvn $$0 = this.a.dM();
      dlf $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cyq.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cyq.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cyu.b);
            if ($$2) {
               this.a.a(atk.cS, 1.0F, 1.0F);
            } else {
               this.a.a(atk.cQ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

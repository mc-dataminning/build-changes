public class gkd implements gjy {
   private final fuv a;
   private boolean b;
   private boolean c = true;

   public gkd(fuv $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cvr $$0 = this.a.dM();
      dlj $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cyu.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cyu.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cyy.b);
            if ($$2) {
               this.a.a(atl.cT, 1.0F, 1.0F);
            } else {
               this.a.a(atl.cR, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

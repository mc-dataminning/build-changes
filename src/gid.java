public class gid implements ghy {
   private final fsv a;
   private boolean b;
   private boolean c = true;

   public gid(fsv $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      ctx $$0 = this.a.dL();
      djp $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cxa.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cxa.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(cxe.b);
            if ($$2) {
               this.a.a(art.cS, 1.0F, 1.0F);
            } else {
               this.a.a(art.cQ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

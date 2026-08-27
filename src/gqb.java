public class gqb implements gpw {
   private final gaq a;
   private boolean b;
   private boolean c = true;

   public gqb(gaq $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dad $$0 = this.a.dN();
      dqh $$1 = $$0.c(this.a.cI().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(ddg.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(ddg.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(ddk.b);
            if ($$2) {
               this.a.a(avc.db, 1.0F, 1.0F);
            } else {
               this.a.a(avc.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

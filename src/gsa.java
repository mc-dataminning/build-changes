public class gsa implements grv {
   private final gco a;
   private boolean b;
   private boolean c = true;

   public gsa(gco $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dbw $$0 = this.a.dP();
      dsa $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dez.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dez.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfd.b);
            if ($$2) {
               this.a.a(avz.db, 1.0F, 1.0F);
            } else {
               this.a.a(avz.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

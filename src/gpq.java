public class gpq implements gpl {
   private final gag a;
   private boolean b;
   private boolean c = true;

   public gpq(gag $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      czu $$0 = this.a.dN();
      dpy $$1 = $$0.c(this.a.cI().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dcx.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dcx.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(ddb.b);
            if ($$2) {
               this.a.a(auz.db, 1.0F, 1.0F);
            } else {
               this.a.a(auz.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

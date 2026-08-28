public class gsb implements grw {
   private final gcp a;
   private boolean b;
   private boolean c = true;

   public gsb(gcp $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dbx $$0 = this.a.dP();
      dsb $$1 = $$0.c(this.a.cK().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfa.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfa.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfe.b);
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

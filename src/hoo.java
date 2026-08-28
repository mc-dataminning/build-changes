public class hoo implements hoj {
   private final grb a;
   private boolean b;
   private boolean c = true;

   public hoo(grb $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      djz $$0 = this.a.dV();
      ebg $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dng.nJ)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dng.nJ) && !this.a.Z_()) {
            boolean $$2 = $$1.c(dnl.b);
            if ($$2) {
               this.a.a(awr.db, 1.0F, 1.0F);
            } else {
               this.a.a(awr.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

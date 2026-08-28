public class hom implements hoh {
   private final gqz a;
   private boolean b;
   private boolean c = true;

   public hom(gqz $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      djx $$0 = this.a.dV();
      ebe $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dne.nJ)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dne.nJ) && !this.a.Z_()) {
            boolean $$2 = $$1.c(dnj.b);
            if ($$2) {
               this.a.a(awp.db, 1.0F, 1.0F);
            } else {
               this.a.a(awp.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

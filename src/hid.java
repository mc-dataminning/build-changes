public class hid implements hhy {
   private final gkv a;
   private boolean b;
   private boolean c = true;

   public hid(gkv $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dgh $$0 = this.a.dV();
      dww $$1 = $$0.c(this.a.cR().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(djn.nF)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(djn.nF) && !this.a.Z_()) {
            boolean $$2 = $$1.c(djs.b);
            if ($$2) {
               this.a.a(awa.db, 1.0F, 1.0F);
            } else {
               this.a.a(awa.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

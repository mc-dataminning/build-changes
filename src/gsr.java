public class gsr implements gsm {
   private final gdf a;
   private boolean b;
   private boolean c = true;

   public gsr(gdf $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dcf $$0 = this.a.dQ();
      dsk $$1 = $$0.c(this.a.cL().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfj.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfj.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfn.b);
            if ($$2) {
               this.a.a(avh.db, 1.0F, 1.0F);
            } else {
               this.a.a(avh.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

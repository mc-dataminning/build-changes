public class gzt implements gzo {
   private final gfs a;
   private boolean b;
   private boolean c = true;

   public gzt(gfs $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dds $$0 = this.a.dS();
      dua $$1 = $$0.c(this.a.cO().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dgx.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dgx.nd) && !this.a.P_()) {
            boolean $$2 = $$1.c(dhb.b);
            if ($$2) {
               this.a.a(awd.db, 1.0F, 1.0F);
            } else {
               this.a.a(awd.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

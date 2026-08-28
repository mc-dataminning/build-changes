public class gst implements gso {
   private final gdh a;
   private boolean b;
   private boolean c = true;

   public gst(gdh $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dcg $$0 = this.a.dR();
      dsl $$1 = $$0.c(this.a.cM().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dfk.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dfk.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dfo.b);
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

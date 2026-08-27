public class gee implements gdz {
   private final fpj a;
   private boolean b;
   private boolean c = true;

   public gee(fpj $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      crs $$0 = this.a.dL();
      dgw $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cuv.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cuv.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(cuz.b);
            if ($$2) {
               this.a.a(aqn.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aqn.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

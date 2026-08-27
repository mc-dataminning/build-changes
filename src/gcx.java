public class gcx implements gcs {
   private final foc a;
   private boolean b;
   private boolean c = true;

   public gcx(foc $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      cqz $$0 = this.a.dL();
      dgb $$1 = $$0.c(this.a.cG().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(cuc.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(cuc.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(cug.b);
            if ($$2) {
               this.a.a(aqd.cu, 1.0F, 1.0F);
            } else {
               this.a.a(aqd.cs, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

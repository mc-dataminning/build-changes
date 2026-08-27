public class gou implements gop {
   private final fzk a;
   private boolean b;
   private boolean c = true;

   public gou(fzk $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      czg $$0 = this.a.dM();
      dpi $$1 = $$0.c(this.a.cH().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dcj.nd)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dcj.nd) && !this.a.N_()) {
            boolean $$2 = $$1.c(dcn.b);
            if ($$2) {
               this.a.a(auo.db, 1.0F, 1.0F);
            } else {
               this.a.a(auo.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}

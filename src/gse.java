public class gse extends gsx<gui, fyd> {
   private final gpi a;

   public gse(gqg<gui, fyd> $$0, gpi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(feb $$0, gih $$1, int $$2, gui $$3, float $$4, float $$5) {
      cwb $$6 = $$3.aW_();
      haf $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = azk.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cvz.h, false, $$0, $$1, $$2, gxu.d, $$7);
         $$0.b();
      }
   }
}

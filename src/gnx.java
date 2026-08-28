public class gnx<T extends cml> extends goa<T, fvv<T>> {
   private final fvq a;

   public gnx(glk<T, fvv<T>> $$0, fxm $$1) {
      super($$0);
      this.a = new fvq($$1.a(fxp.aG));
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      tx $$9 = $$8 ? $$3.gr() : $$3.gs();
      bsn.a($$9.l("id")).filter($$0x -> $$0x == bsn.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cc() ? -1.3F : -1.5F, 0.0F);
         cfi.b $$11 = cfi.b.a($$9.h("Variant"));
         fas $$12 = $$1.getBuffer(this.a.a(glb.a($$11)));
         this.a.a($$0, $$12, $$2, gph.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

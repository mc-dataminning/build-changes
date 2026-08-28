public class goq<T extends cmx> extends got<T, fwn<T>> {
   private final fwi a;

   public goq(gmd<T, fwn<T>> $$0, fye $$1) {
      super($$0);
      this.a = new fwi($$1.a(fyh.aH));
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ub $$9 = $$8 ? $$3.gq() : $$3.gr();
      bsx.a($$9.l("id")).filter($$0x -> $$0x == bsx.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cb() ? -1.3F : -1.5F, 0.0F);
         cfu.b $$11 = cfu.b.a($$9.h("Variant"));
         fbk $$12 = $$1.getBuffer(this.a.a(glu.a($$11)));
         this.a.a($$0, $$12, $$2, gqa.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

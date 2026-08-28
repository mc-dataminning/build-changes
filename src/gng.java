public class gng<T extends cmx> extends gnj<T, fvf<T>> {
   private final fva a;

   public gng(gkt<T, fvf<T>> $$0, fww $$1) {
      super($$0);
      this.a = new fva($$1.a(fwz.aG));
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      us $$9 = $$8 ? $$3.gt() : $$3.gu();
      bta.a($$9.l("id")).filter($$0x -> $$0x == bta.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cfv.b $$11 = cfv.b.a($$9.h("Variant"));
         fac $$12 = $$1.getBuffer(this.a.a(gkk.a($$11)));
         this.a.a($$0, $$12, $$2, goq.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

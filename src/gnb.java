public class gnb<T extends cms> extends gne<T, fva<T>> {
   private final fuv a;

   public gnb(gko<T, fva<T>> $$0, fwr $$1) {
      super($$0);
      this.a = new fuv($$1.a(fwu.aG));
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ur $$9 = $$8 ? $$3.gt() : $$3.gu();
      bsv.a($$9.l("id")).filter($$0x -> $$0x == bsv.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cfq.b $$11 = cfq.b.a($$9.h("Variant"));
         ezx $$12 = $$1.getBuffer(this.a.a(gkf.a($$11)));
         this.a.a($$0, $$12, $$2, gol.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

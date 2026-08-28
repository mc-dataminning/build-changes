public class gnv<T extends cmk> extends gny<T, fvt<T>> {
   private final fvo a;

   public gnv(gli<T, fvt<T>> $$0, fxk $$1) {
      super($$0);
      this.a = new fvo($$1.a(fxn.aG));
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      tx $$9 = $$8 ? $$3.gq() : $$3.gr();
      bsm.a($$9.l("id")).filter($$0x -> $$0x == bsm.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cb() ? -1.3F : -1.5F, 0.0F);
         cfh.b $$11 = cfh.b.a($$9.h("Variant"));
         faq $$12 = $$1.getBuffer(this.a.a(gkz.a($$11)));
         this.a.a($$0, $$12, $$2, gpf.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

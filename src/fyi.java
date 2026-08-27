public class fyi<T extends ccx> extends fyl<T, fhc<T>> {
   private final fgx a;

   public fyi(fvy<T, fhc<T>> $$0, fis $$1) {
      super($$0);
      this.a = new fgx($$1.a(fiv.aA));
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      rt $$9 = $$8 ? $$3.gj() : $$3.gk();
      bjx.a($$9.l("id")).filter($$0x -> $$0x == bjx.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         bwk.b $$11 = bwk.b.a($$9.h("Variant"));
         eml $$12 = $$1.getBuffer(this.a.a(fvp.a($$11)));
         this.a.a($$0, $$12, $$2, fzr.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

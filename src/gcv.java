public class gcv<T extends cfi> extends gcy<T, flc<T>> {
   private final fkx a;

   public gcv(gai<T, flc<T>> $$0, fmt $$1) {
      super($$0);
      this.a = new fkx($$1.a(fmw.aD));
   }

   public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sn $$9 = $$8 ? $$3.gj() : $$3.gk();
      blz.a($$9.l("id")).filter($$0x -> $$0x == blz.au).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         byo.b $$11 = byo.b.a($$9.h("Variant"));
         eqf $$12 = $$1.getBuffer(this.a.a(fzz.a($$11)));
         this.a.a($$0, $$12, $$2, gee.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

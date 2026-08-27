public class gjz<T extends cka> extends gkc<T, fsa<T>> {
   private final frv a;

   public gjz(ghm<T, fsa<T>> $$0, ftr $$1) {
      super($$0);
      this.a = new frv($$1.a(ftu.aG));
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      to $$9 = $$8 ? $$3.gq() : $$3.gr();
      bqg.a($$9.l("id")).filter($$0x -> $$0x == bqg.aw).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         ccy.b $$11 = ccy.b.a($$9.h("Variant"));
         ewv $$12 = $$1.getBuffer(this.a.a(ghd.a($$11)));
         this.a.a($$0, $$12, $$2, glj.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

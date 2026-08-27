public class gjq<T extends cjt> extends gjt<T, frr<T>> {
   private final frm a;

   public gjq(ghd<T, frr<T>> $$0, fti $$1) {
      super($$0);
      this.a = new frm($$1.a(ftl.aG));
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      tm $$9 = $$8 ? $$3.gq() : $$3.gr();
      bqb.a($$9.l("id")).filter($$0x -> $$0x == bqb.aw).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         cct.b $$11 = cct.b.a($$9.h("Variant"));
         ewm $$12 = $$1.getBuffer(this.a.a(ggu.a($$11)));
         this.a.a($$0, $$12, $$2, gla.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

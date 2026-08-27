public class gct<T extends cfh> extends gcw<T, fla<T>> {
   private final fkv a;

   public gct(gag<T, fla<T>> $$0, fmr $$1) {
      super($$0);
      this.a = new fkv($$1.a(fmu.aD));
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sn $$9 = $$8 ? $$3.gj() : $$3.gk();
      bly.a($$9.l("id")).filter($$0x -> $$0x == bly.au).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         byn.b $$11 = byn.b.a($$9.h("Variant"));
         eqd $$12 = $$1.getBuffer(this.a.a(fzx.a($$11)));
         this.a.a($$0, $$12, $$2, gec.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

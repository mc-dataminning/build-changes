public class gni<T extends cmz> extends gnl<T, fvh<T>> {
   private final fvc a;

   public gni(gkv<T, fvh<T>> $$0, fwy $$1) {
      super($$0);
      this.a = new fvc($$1.a(fxb.aG));
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      us $$9 = $$8 ? $$3.gt() : $$3.gu();
      btc.a($$9.l("id")).filter($$0x -> $$0x == btc.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cfx.b $$11 = cfx.b.a($$9.h("Variant"));
         fae $$12 = $$1.getBuffer(this.a.a(gkm.a($$11)));
         this.a.a($$0, $$12, $$2, gos.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

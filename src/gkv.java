public class gkv<T extends ckl> extends gky<T, fsw<T>> {
   private final fsr a;

   public gkv(gii<T, fsw<T>> $$0, fun $$1) {
      super($$0);
      this.a = new fsr($$1.a(fuq.aG));
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ty $$9 = $$8 ? $$3.gr() : $$3.gs();
      bqr.a($$9.l("id")).filter($$0x -> $$0x == bqr.aw).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bY() ? -1.3F : -1.5F, 0.0F);
         cdj.b $$11 = cdj.b.a($$9.h("Variant"));
         exr $$12 = $$1.getBuffer(this.a.a(ghz.a($$11)));
         this.a.a($$0, $$12, $$2, gmf.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

public class fxo<T extends cbw> extends fxr<T, fgk<T>> {
   private final fgf a;

   public fxo(fve<T, fgk<T>> $$0, fia $$1) {
      super($$0);
      this.a = new fgf($$1.a(fid.aA));
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qy $$9 = $$8 ? $$3.gi() : $$3.gj();
      biw.a($$9.l("id")).filter($$0x -> $$0x == biw.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         bvj.b $$11 = bvj.b.a($$9.h("Variant"));
         elv $$12 = $$1.getBuffer(this.a.a(fuv.a($$11)));
         this.a.a($$0, $$12, $$2, fyx.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

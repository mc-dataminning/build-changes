public class gom<T extends cmv> extends gop<T, fwj<T>> {
   private final fwe a;

   public gom(glz<T, fwj<T>> $$0, fya $$1) {
      super($$0);
      this.a = new fwe($$1.a(fyd.aH));
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ua $$9 = $$8 ? $$3.gq() : $$3.gr();
      bsw.a($$9.l("id")).filter($$0x -> $$0x == bsw.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cb() ? -1.3F : -1.5F, 0.0F);
         cfs.b $$11 = cfs.b.a($$9.h("Variant"));
         fbg $$12 = $$1.getBuffer(this.a.a(glq.a($$11)));
         this.a.a($$0, $$12, $$2, gpw.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

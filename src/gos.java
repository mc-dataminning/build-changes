public class gos<T extends cmx> extends gov<T, fwp<T>> {
   private final fwk a;

   public gos(gmf<T, fwp<T>> $$0, fyg $$1) {
      super($$0);
      this.a = new fwk($$1.a(fyj.aH));
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ub $$9 = $$8 ? $$3.gp() : $$3.gq();
      bsx.a($$9.l("id")).filter($$0x -> $$0x == bsx.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cb() ? -1.3F : -1.5F, 0.0F);
         cfu.b $$11 = cfu.b.a($$9.h("Variant"));
         fbm $$12 = $$1.getBuffer(this.a.a(glw.a($$11)));
         this.a.a($$0, $$12, $$2, gqc.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

public class gnp<T extends cmh> extends gns<T, fvn<T>> {
   private final fvi a;

   public gnp(glc<T, fvn<T>> $$0, fxe $$1) {
      super($$0);
      this.a = new fvi($$1.a(fxh.aG));
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      tx $$9 = $$8 ? $$3.gp() : $$3.gq();
      bsj.a($$9.l("id")).filter($$0x -> $$0x == bsj.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cfe.b $$11 = cfe.b.a($$9.h("Variant"));
         fak $$12 = $$1.getBuffer(this.a.a(gkt.a($$11)));
         this.a.a($$0, $$12, $$2, goz.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

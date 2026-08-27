public class gcn<T extends cfb> extends gcq<T, fku<T>> {
   private final fkp a;

   public gcn(gaa<T, fku<T>> $$0, fml $$1) {
      super($$0);
      this.a = new fkp($$1.a(fmo.aD));
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sl $$9 = $$8 ? $$3.gj() : $$3.gk();
      blt.a($$9.l("id")).filter($$0x -> $$0x == blt.au).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         byi.b $$11 = byi.b.a($$9.h("Variant"));
         epx $$12 = $$1.getBuffer(this.a.a(fzr.a($$11)));
         this.a.a($$0, $$12, $$2, gdw.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

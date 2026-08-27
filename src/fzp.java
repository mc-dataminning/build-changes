public class fzp<T extends cdm> extends fzs<T, fih<T>> {
   private final fic a;

   public fzp(fxf<T, fih<T>> $$0, fjx $$1) {
      super($$0);
      this.a = new fic($$1.a(fka.aA));
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      rz $$9 = $$8 ? $$3.gj() : $$3.gk();
      bkm.a($$9.l("id")).filter($$0x -> $$0x == bkm.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         bwz.b $$11 = bwz.b.a($$9.h("Variant"));
         eno $$12 = $$1.getBuffer(this.a.a(fww.a($$11)));
         this.a.a($$0, $$12, $$2, gay.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

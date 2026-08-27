public class fxi<T extends cca> extends fxl<T, fgd<T>> {
   private final ffy a;

   public fxi(fuy<T, fgd<T>> $$0, fht $$1) {
      super($$0);
      this.a = new ffy($$1.a(fhw.aA));
   }

   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qw $$9 = $$8 ? $$3.gj() : $$3.gk();
      bja.a($$9.l("id")).filter($$0x -> $$0x == bja.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         bvn.b $$11 = bvn.b.a($$9.h("Variant"));
         eln $$12 = $$1.getBuffer(this.a.a(fup.a($$11)));
         this.a.a($$0, $$12, $$2, fyr.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

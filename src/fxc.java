public class fxc<T extends cbm> extends fxf<T, ffy<T>> {
   private final fft a;

   public fxc(fus<T, ffy<T>> $$0, fho $$1) {
      super($$0);
      this.a = new fft($$1.a(fhr.aA));
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qr $$9 = $$8 ? $$3.gh() : $$3.gi();
      bim.a($$9.l("id")).filter($$0x -> $$0x == bim.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         buz.b $$11 = buz.b.a($$9.h("Variant"));
         elj $$12 = $$1.getBuffer(this.a.a(fuj.a($$11)));
         this.a.a($$0, $$12, $$2, fyl.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

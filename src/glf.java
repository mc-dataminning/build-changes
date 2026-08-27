public class glf<T extends clh> extends gli<T, ftg<T>> {
   private final ftb a;

   public glf(gis<T, ftg<T>> $$0, fux $$1) {
      super($$0);
      this.a = new ftb($$1.a(fva.aG));
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ua $$9 = $$8 ? $$3.gr() : $$3.gs();
      brn.a($$9.l("id")).filter($$0x -> $$0x == brn.aw).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bY() ? -1.3F : -1.5F, 0.0F);
         cef.b $$11 = cef.b.a($$9.h("Variant"));
         eyb $$12 = $$1.getBuffer(this.a.a(gij.a($$11)));
         this.a.a($$0, $$12, $$2, gmp.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

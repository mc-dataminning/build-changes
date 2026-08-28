public class gnh<T extends cmy> extends gnk<T, fvg<T>> {
   private final fvb a;

   public gnh(gku<T, fvg<T>> $$0, fwx $$1) {
      super($$0);
      this.a = new fvb($$1.a(fxa.aG));
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      us $$9 = $$8 ? $$3.gt() : $$3.gu();
      btb.a($$9.l("id")).filter($$0x -> $$0x == btb.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cfw.b $$11 = cfw.b.a($$9.h("Variant"));
         fad $$12 = $$1.getBuffer(this.a.a(gkl.a($$11)));
         this.a.a($$0, $$12, $$2, gor.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

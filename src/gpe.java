public class gpe<T extends cly> extends gpi<T, fww<T>> {
   private final fwr a;

   public gpe(gmp<T, fww<T>> $$0, fyo $$1) {
      super($$0);
      this.a = new fwr($$1.a(fyr.aK));
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      uk $$9 = $$8 ? $$3.gE() : $$3.gF();
      bsb.a($$9.l("id")).filter($$0x -> $$0x == bsb.ay).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.cf() ? -1.3F : -1.5F, 0.0F);
         ceu.b $$11 = ceu.b.a($$9.h("Variant"));
         fbg $$12 = $$1.getBuffer(this.a.a(gmf.a($$11)));
         this.a.a($$0, $$12, $$2, gqp.d, $$4, $$5, $$6, $$7, $$3.am);
         $$0.b();
      });
   }
}

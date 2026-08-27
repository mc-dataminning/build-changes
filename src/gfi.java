public class gfi<T extends chl> extends gfl<T, fnn<T>> {
   private final fni a;

   public gfi(gcv<T, fnn<T>> $$0, fpf $$1) {
      super($$0);
      this.a = new fni($$1.a(fpi.aC));
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sw $$9 = $$8 ? $$3.gk() : $$3.gl();
      bnw.a($$9.l("id")).filter($$0x -> $$0x == bnw.av).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         can.b $$11 = can.b.a($$9.h("Variant"));
         esl $$12 = $$1.getBuffer(this.a.a(gcm.a($$11)));
         this.a.a($$0, $$12, $$2, ggs.d, $$4, $$5, $$6, $$7, $$3.ag);
         $$0.b();
      });
   }
}

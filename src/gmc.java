public class gmc<T extends clw> extends gmf<T, fub<T>> {
   private final ftw a;

   public gmc(gjp<T, fub<T>> $$0, fvs $$1) {
      super($$0);
      this.a = new ftw($$1.a(fvv.aG));
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ud $$9 = $$8 ? $$3.gt() : $$3.gu();
      bsa.a($$9.l("id")).filter($$0x -> $$0x == bsa.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         ceu.b $$11 = ceu.b.a($$9.h("Variant"));
         eyw $$12 = $$1.getBuffer(this.a.a(gjg.a($$11)));
         this.a.a($$0, $$12, $$2, gnm.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}

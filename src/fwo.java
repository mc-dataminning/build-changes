public class fwo<T extends cbl> extends fwr<T, ffp<T>> {
   private final ffk a;

   public fwo(fue<T, ffp<T>> $$0, fhf $$1) {
      super($$0);
      this.a = new ffk($$1.a(fhi.aA));
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qs $$9 = $$8 ? $$3.gh() : $$3.gi();
      bik.a($$9.l("id")).filter($$0x -> $$0x == bik.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bW() ? -1.3F : -1.5F, 0.0F);
         buy.b $$11 = buy.b.a($$9.h("Variant"));
         ell $$12 = $$1.getBuffer(this.a.a(ftv.a($$11)));
         this.a.a($$0, $$12, $$2, fxx.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}

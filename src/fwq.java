public class fwq<T extends cbl, M extends fek<T> & fdl & fes> extends fwk<T, M> {
   private final fnc a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fwq(fue<T, M> $$0, fnc $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(biw $$0, ciw $$1, cit $$2, biq $$3, elh $$4, fng $$5, int $$6) {
      if ($$1.a(ciz.qj) && $$0.fn() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(biw $$0, ciw $$1, biq $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      fhj $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aro.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fvw.a($$3, false);
      boolean $$8 = $$2 == biq.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cit.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

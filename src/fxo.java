public class fxo<T extends cbu, M extends ffd<T> & fee & ffl> extends fxi<T, M> {
   private final foa a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fxo(fvc<T, M> $$0, foa $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bjg $$0, cjf $$1, cjc $$2, bja $$3, elp $$4, foe $$5, int $$6) {
      if ($$1.a(cji.qj) && $$0.fo() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bjg $$0, cjf $$1, bja $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      fic $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = arw.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fwu.a($$3, false);
      boolean $$8 = $$2 == bja.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cjc.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

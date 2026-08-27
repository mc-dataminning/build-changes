public class fxq<T extends cbw, M extends fff<T> & feg & ffn> extends fxk<T, M> {
   private final foc a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fxq(fve<T, M> $$0, foc $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bji $$0, cjh $$1, cje $$2, bjc $$3, elr $$4, fog $$5, int $$6) {
      if ($$1.a(cjk.qj) && $$0.fo() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bji $$0, cjh $$1, bjc $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      fie $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ary.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fww.a($$3, false);
      boolean $$8 = $$2 == bjc.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cje.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

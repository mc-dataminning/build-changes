public class glh<T extends clh, M extends fsb<T> & fra & fsj> extends glb<T, M> {
   private final gbk a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public glh(gis<T, M> $$0, gbk $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bsa $$0, csz $$1, csw $$2, bru $$3, exx $$4, gbo $$5, int $$6) {
      if ($$1.a(ctc.qX) && $$0.fv() == $$1 && $$0.aM == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bsa $$0, csz $$1, bru $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      fvb $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = axz.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gkn.a($$3, false);
      boolean $$8 = $$2 == bru.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, csw.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

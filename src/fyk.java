public class fyk<T extends ccx, M extends ffx<T> & fey & fgf> extends fye<T, M> {
   private final fox a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fyk(fvy<T, M> $$0, fox $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bkj $$0, ckj $$1, ckg $$2, bkd $$3, emh $$4, fpb $$5, int $$6) {
      if ($$1.a(ckm.qj) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bkj $$0, ckj $$1, bkd $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      fiw $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = asy.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fxq.a($$3, false);
      boolean $$8 = $$2 == bkd.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, ckg.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

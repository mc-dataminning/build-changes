public class gfk<T extends chl, M extends fmi<T> & fli & fmq> extends gfe<T, M> {
   private final fvp a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gfk(gcv<T, M> $$0, fvp $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(boi $$0, cpd $$1, cpa $$2, boc $$3, esh $$4, fvt $$5, int $$6) {
      if ($$1.a(cpg.qW) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(boi $$0, cpd $$1, boc $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      fpj $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = awi.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      geq.a($$3, false);
      boolean $$8 = $$2 == boc.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cpa.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

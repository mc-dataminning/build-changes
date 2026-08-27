public class gcx<T extends cfi, M extends fjx<T> & fix & fkf> extends gcr<T, M> {
   private final ftd a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gcx(gai<T, M> $$0, ftd $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bml $$0, cmy $$1, cmv $$2, bmf $$3, eqb $$4, fth $$5, int $$6) {
      if ($$1.a(cnb.qU) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bml $$0, cmy $$1, bmf $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      fmx $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = auo.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gcd.a($$3, false);
      boolean $$8 = $$2 == bmf.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cmv.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

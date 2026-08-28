public class gnj<T extends cmy, M extends fub<T> & fta & fuj> extends gnd<T, M> {
   private final gdl a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnj(gku<T, M> $$0, gdl $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btq $$0, cuq $$1, cun $$2, btk $$3, ezz $$4, gdp $$5, int $$6) {
      if ($$1.a(cut.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btq $$0, cuq $$1, btk $$2, ezz $$3, gdp $$4, int $$5) {
      $$3.a();
      fxb $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayz.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmp.a($$3, false);
      boolean $$8 = $$2 == btk.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cun.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

public class gnd<T extends cms, M extends ftv<T> & fsu & fud> extends gmx<T, M> {
   private final gdf a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnd(gko<T, M> $$0, gdf $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btk $$0, cuk $$1, cuh $$2, bte $$3, ezt $$4, gdj $$5, int $$6) {
      if ($$1.a(cun.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btk $$0, cuk $$1, bte $$2, ezt $$3, gdj $$4, int $$5) {
      $$3.a();
      fwv $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayu.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmj.a($$3, false);
      boolean $$8 = $$2 == bte.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cuh.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

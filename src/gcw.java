public class gcw<T extends cfh, M extends fjw<T> & fiw & fke> extends gcq<T, M> {
   private final ftc a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gcw(gah<T, M> $$0, ftc $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bmk $$0, cmx $$1, cmu $$2, bme $$3, eqa $$4, ftg $$5, int $$6) {
      if ($$1.a(cna.qU) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bmk $$0, cmx $$1, bme $$2, eqa $$3, ftg $$4, int $$5) {
      $$3.a();
      fmw $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aun.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gcc.a($$3, false);
      boolean $$8 = $$2 == bme.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cmu.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

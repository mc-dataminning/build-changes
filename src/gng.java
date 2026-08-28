public class gng<T extends cmv, M extends fty<T> & fsx & fug> extends gna<T, M> {
   private final gdi a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gng(gkr<T, M> $$0, gdi $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btn $$0, cun $$1, cuk $$2, bth $$3, ezw $$4, gdm $$5, int $$6) {
      if ($$1.a(cuq.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btn $$0, cun $$1, bth $$2, ezw $$3, gdm $$4, int $$5) {
      $$3.a();
      fwy $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayx.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmm.a($$3, false);
      boolean $$8 = $$2 == bth.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cuk.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

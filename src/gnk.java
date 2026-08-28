public class gnk<T extends cmz, M extends fuc<T> & ftb & fuk> extends gne<T, M> {
   private final gdm a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnk(gkv<T, M> $$0, gdm $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btr $$0, cur $$1, cuo $$2, btl $$3, faa $$4, gdq $$5, int $$6) {
      if ($$1.a(cuu.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btr $$0, cur $$1, btl $$2, faa $$3, gdq $$4, int $$5) {
      $$3.a();
      fxc $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayz.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmq.a($$3, false);
      boolean $$8 = $$2 == btl.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cuo.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

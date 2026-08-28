public class gnz<T extends cml, M extends fuq<T> & ftp & fuy> extends gnt<T, M> {
   private final geb a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnz(glk<T, M> $$0, geb $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btc $$0, cud $$1, cua $$2, bsw $$3, fao $$4, gef $$5, int $$6) {
      if ($$1.a(cug.qX) && $$0.fv() == $$1 && $$0.aM == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btc $$0, cud $$1, bsw $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      fxq $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayg.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gnf.a($$3, false);
      boolean $$8 = $$2 == bsw.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cua.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

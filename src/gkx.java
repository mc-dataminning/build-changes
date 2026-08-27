public class gkx<T extends ckl, M extends frr<T> & fqq & frz> extends gkr<T, M> {
   private final gba a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gkx(gii<T, M> $$0, gba $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bre $$0, csd $$1, csa $$2, bqy $$3, exn $$4, gbe $$5, int $$6) {
      if ($$1.a(csg.qX) && $$0.fv() == $$1 && $$0.aM == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bre $$0, csd $$1, bqy $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      fur $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = axw.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gkd.a($$3, false);
      boolean $$8 = $$2 == bqy.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, csa.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

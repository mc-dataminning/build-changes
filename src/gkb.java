public class gkb<T extends cka, M extends fqv<T> & fpu & frd> extends gjv<T, M> {
   private final gae a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gkb(ghm<T, M> $$0, gae $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bqt $$0, crs $$1, crp $$2, bqn $$3, ewr $$4, gai $$5, int $$6) {
      if ($$1.a(crv.qW) && $$0.fu() == $$1 && $$0.aK == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bqt $$0, crs $$1, bqn $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      ftv $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = axm.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gjh.a($$3, false);
      boolean $$8 = $$2 == bqn.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, crp.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

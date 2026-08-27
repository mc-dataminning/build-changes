public class ghl<T extends ciu, M extends foe<T> & fne & fom> extends ghf<T, M> {
   private final fxo a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public ghl(gew<T, M> $$0, fxo $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bpp $$0, cqm $$1, cqj $$2, bpj $$3, eub $$4, fxs $$5, int $$6) {
      if ($$1.a(cqp.qW) && $$0.fu() == $$1 && $$0.aK == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bpp $$0, cqm $$1, bpj $$2, eub $$3, fxs $$4, int $$5) {
      $$3.a();
      frf $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aww.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      ggr.a($$3, false);
      boolean $$8 = $$2 == bpj.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cqj.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

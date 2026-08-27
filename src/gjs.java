public class gjs<T extends cjt, M extends fqm<T> & fpl & fqu> extends gjm<T, M> {
   private final fzv a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gjs(ghd<T, M> $$0, fzv $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bqo $$0, crj $$1, crg $$2, bqi $$3, ewi $$4, fzz $$5, int $$6) {
      if ($$1.a(crm.qW) && $$0.fu() == $$1 && $$0.aK == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bqo $$0, crj $$1, bqi $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      ftm $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = axk.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      giy.a($$3, false);
      boolean $$8 = $$2 == bqi.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, crg.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

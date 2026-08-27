public class gae<T extends cdu, M extends fhp<T> & fgq & fhx> extends fzy<T, M> {
   private final fqq a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gae(fxs<T, M> $$0, fqq $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(blg $$0, clj $$1, clg $$2, bla $$3, enw $$4, fqu $$5, int $$6) {
      if ($$1.a(clm.qU) && $$0.fq() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(blg $$0, clj $$1, bla $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      fko $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = atm.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fzk.a($$3, false);
      boolean $$8 = $$2 == bla.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, clg.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

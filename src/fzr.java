public class fzr<T extends cdm, M extends fhc<T> & fgd & fhk> extends fzl<T, M> {
   private final fqd a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fzr(fxf<T, M> $$0, fqd $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bky $$0, clb $$1, cky $$2, bks $$3, enk $$4, fqh $$5, int $$6) {
      if ($$1.a(cle.qj) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bky $$0, clb $$1, bks $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      fkb $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ati.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fyx.a($$3, false);
      boolean $$8 = $$2 == bks.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cky.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

public class gpg<T extends cly, M extends fvq<T> & fuo & fvy> extends goy<T, M> {
   private final gfc a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gpg(gmp<T, M> $$0, gfc $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bso $$0, cuh $$1, cue $$2, bsi $$3, fbc $$4, gfg $$5, int $$6) {
      if ($$1.a(cuk.su) && $$0.fG() == $$1 && $$0.aV == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bso $$0, cuh $$1, bsi $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      fys $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aym.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gok.a($$3, false);
      boolean $$8 = $$2 == bsi.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cue.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

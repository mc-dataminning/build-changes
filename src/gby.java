public class gby<T extends cer, M extends fiy<T> & fhy & fjg> extends gbs<T, M> {
   private final fse a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gby(fzj<T, M> $$0, fse $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(blv $$0, cmh $$1, cme $$2, blp $$3, epd $$4, fsi $$5, int $$6) {
      if ($$1.a(cmk.qU) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(blv $$0, cmh $$1, blp $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      fly $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aty.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gbe.a($$3, false);
      boolean $$8 = $$2 == blp.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cme.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

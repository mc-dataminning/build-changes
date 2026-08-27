public class gaj<T extends cdz, M extends fhu<T> & fgv & fic> extends gad<T, M> {
   private final fqv a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gaj(fxx<T, M> $$0, fqv $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bll $$0, clo $$1, cll $$2, blf $$3, eob $$4, fqz $$5, int $$6) {
      if ($$1.a(clr.qU) && $$0.fq() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bll $$0, clo $$1, blf $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      fkt $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = atq.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fzp.a($$3, false);
      boolean $$8 = $$2 == blf.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cll.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

public class gme<T extends cly, M extends fsw<T> & frv & fte> extends gly<T, M> {
   private final gcg a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gme(gjp<T, M> $$0, gcg $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bsq $$0, ctq $$1, ctn $$2, bsk $$3, eyu $$4, gck $$5, int $$6) {
      if ($$1.a(ctt.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bsq $$0, ctq $$1, bsk $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      fvw $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayf.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      glk.a($$3, false);
      boolean $$8 = $$2 == bsk.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, ctn.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

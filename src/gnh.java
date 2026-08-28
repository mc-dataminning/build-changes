public class gnh<T extends cmw, M extends ftz<T> & fsy & fuh> extends gnb<T, M> {
   private final gdj a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnh(gks<T, M> $$0, gdj $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bto $$0, cuo $$1, cul $$2, bti $$3, ezx $$4, gdn $$5, int $$6) {
      if ($$1.a(cur.qX) && $$0.fx() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bto $$0, cuo $$1, bti $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      fwz $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayy.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmn.a($$3, false);
      boolean $$8 = $$2 == bti.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cul.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

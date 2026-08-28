public class gnx<T extends cmk, M extends fuo<T> & ftn & fuw> extends gnr<T, M> {
   private final gdz a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnx(gli<T, M> $$0, gdz $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btb $$0, cuc $$1, ctz $$2, bsv $$3, fam $$4, ged $$5, int $$6) {
      if ($$1.a(cuf.qX) && $$0.fu() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btb $$0, cuc $$1, bsv $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      fxo $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayg.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gnd.a($$3, false);
      boolean $$8 = $$2 == bsv.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, ctz.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

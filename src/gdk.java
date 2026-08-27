public class gdk<T extends cfq, M extends fkj<T> & fjj & fkr> extends gde<T, M> {
   private final ftp a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gdk(gav<T, M> $$0, ftp $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bmo $$0, cng $$1, cnd $$2, bmi $$3, eqk $$4, ftt $$5, int $$6) {
      if ($$1.a(cnj.qW) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bmo $$0, cng $$1, bmi $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      fnj $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aup.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gcq.a($$3, false);
      boolean $$8 = $$2 == bmi.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cnd.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}

import javax.annotation.Nullable;

public class gre<S extends guf, M extends fxa<S> & fvx & fxj> extends gqy<S, M> {
   private final gnq a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gre(goo<S, M> $$0, gnq $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable gym $$1, cvl $$2, cvi $$3, btz $$4, fcu $$5, ggv $$6, int $$7) {
      if ($$1 != null) {
         brj $$8 = $$4 == $$0.ap ? brj.a : brj.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cvo.qY)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(gym $$0, cvl $$1, btz $$2, fcu $$3, ggv $$4, int $$5) {
      $$3.a();
      this.d().a().a($$3);
      gab $$6 = this.d().c();
      float $$7 = $$6.e;
      $$6.e = azc.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gqk.a($$3, gqk.a.a);
      boolean $$8 = $$2 == btz.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cvi.f, false, $$3, $$4, $$5, gwb.d, $$0);
      $$3.b();
   }
}

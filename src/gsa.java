import javax.annotation.Nullable;

public class gsa<S extends gvb, M extends fxo<S> & fwl & fxx> extends gru<S, M> {
   private final gom a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gsa(gpk<S, M> $$0, gom $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable gzi $$1, cvs $$2, cvp $$3, buh $$4, fdi $$5, ghl $$6, int $$7) {
      if ($$1 != null) {
         brr $$8 = $$4 == $$0.ap ? brr.a : brr.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cvw.qY)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(gzi $$0, cvs $$1, buh $$2, fdi $$3, ghl $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gaq $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = azf.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      grg.a($$3, grg.a.a);
      boolean $$8 = $$2 == buh.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cvp.f, false, $$3, $$4, $$5, gwx.d, $$0);
      $$3.b();
   }
}

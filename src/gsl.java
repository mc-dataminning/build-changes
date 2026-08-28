import javax.annotation.Nullable;

public class gsl<S extends gvn, M extends fxz<S> & fww & fyi> extends gsf<S, M> {
   private final gox a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gsl(gpv<S, M> $$0, gox $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable gzu $$1, cvx $$2, cvv $$3, bup $$4, fdt $$5, ghw $$6, int $$7) {
      if ($$1 != null) {
         brx $$8 = $$4 == $$0.ap ? brx.a : brx.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cwb.qY)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(gzu $$0, cvx $$1, bup $$2, fdt $$3, ghw $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gbb $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = azj.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      grr.a($$3, grr.a.a);
      boolean $$8 = $$2 == bup.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cvv.f, false, $$3, $$4, $$5, gxj.d, $$0);
      $$3.b();
   }
}

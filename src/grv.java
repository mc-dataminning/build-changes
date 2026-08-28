import javax.annotation.Nullable;

public class grv<S extends guw, M extends fxk<S> & fwh & fxt> extends grp<S, M> {
   private final goh a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public grv(gpf<S, M> $$0, goh $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable gzd $$1, cvp $$2, cvm $$3, bue $$4, fde $$5, ghg $$6, int $$7) {
      if ($$1 != null) {
         bro $$8 = $$4 == $$0.ap ? bro.a : bro.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cvt.qY)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(gzd $$0, cvp $$1, bue $$2, fde $$3, ghg $$4, int $$5) {
      $$3.a();
      this.d().a().a($$3);
      gal $$6 = this.d().c();
      float $$7 = $$6.e;
      $$6.e = azd.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      grb.a($$3, grb.a.a);
      boolean $$8 = $$2 == bue.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cvm.f, false, $$3, $$4, $$5, gws.d, $$0);
      $$3.b();
   }
}

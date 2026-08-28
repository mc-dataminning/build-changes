import javax.annotation.Nullable;

public class gwd<S extends gzf, M extends gbl<S> & gah & gbu> extends gvw<S, M> {
   private final gsn a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gwd(gtm<S, M> $$0, gsn $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable hdm $$1, cxo $$2, cxm $$3, bvz $$4, fgr $$5, glk $$6, int $$7) {
      if ($$1 != null) {
         bth $$8 = $$4 == $$0.ap ? bth.a : bth.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cxs.rL)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(hdm $$0, cxo $$1, bvz $$2, fgr $$3, glk $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gen $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = bae.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gvi.a($$3, gvi.a.a);
      boolean $$8 = $$2 == bvz.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cxm.f, false, $$3, $$4, $$5, hbb.d, $$0);
      $$3.b();
   }
}

import javax.annotation.Nullable;

public class gwc<S extends gze, M extends gbk<S> & gag & gbt> extends gvv<S, M> {
   private final gsm a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gwc(gtl<S, M> $$0, gsm $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable hdl $$1, cxo $$2, cxm $$3, bvz $$4, fgq $$5, glj $$6, int $$7) {
      if ($$1 != null) {
         bth $$8 = $$4 == $$0.ap ? bth.a : bth.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cxs.rL)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(hdl $$0, cxo $$1, bvz $$2, fgq $$3, glj $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gem $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = bae.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gvh.a($$3, gvh.a.a);
      boolean $$8 = $$2 == bvz.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cxm.f, false, $$3, $$4, $$5, hba.d, $$0);
      $$3.b();
   }
}

import javax.annotation.Nullable;

public class gvz<S extends gzb, M extends gbh<S> & gab & gbq> extends gvs<S, M> {
   private final gsj a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gvz(gti<S, M> $$0, gsj $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable hdi $$1, cxg $$2, cxe $$3, bvr $$4, fgl $$5, glg $$6, int $$7) {
      if ($$1 != null) {
         bsz $$8 = $$4 == $$0.ap ? bsz.a : bsz.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cxk.rU)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(hdi $$0, cxg $$1, bvr $$2, fgl $$3, glg $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gej $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = azu.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gve.a($$3, gve.a.a);
      boolean $$8 = $$2 == bvr.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cxe.f, false, $$3, $$4, $$5, hax.d, $$0);
      $$3.b();
   }
}

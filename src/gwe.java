import javax.annotation.Nullable;

public class gwe<S extends gzg, M extends gbm<S> & gai & gbv> extends gvx<S, M> {
   private final gso a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gwe(gtn<S, M> $$0, gso $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable hdn $$1, cxp $$2, cxn $$3, bwa $$4, fgs $$5, gll $$6, int $$7) {
      if ($$1 != null) {
         bti $$8 = $$4 == $$0.ap ? bti.a : bti.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cxt.rL)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(hdn $$0, cxp $$1, bwa $$2, fgs $$3, gll $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      geo $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = bae.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gvj.a($$3, gvj.a.a);
      boolean $$8 = $$2 == bwa.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cxn.f, false, $$3, $$4, $$5, hbc.d, $$0);
      $$3.b();
   }
}

public class gwi<S extends gxm, M extends gby<S> & gas> extends gwq<S, M> {
   public gwi(gty<S, M> $$0) {
      super($$0);
   }

   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, buz.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, buz.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hbk $$1, buz $$2, ffs $$3, glv $$4, int $$5) {
      if (!$$1.c()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == buz.a;
         $$3.a((float)($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hec.d);
         $$3.b();
      }
   }
}

public class han<S extends hbr, M extends gfy<S> & geo> extends hav<S, M> {
   public han(gye<S, M> $$0) {
      super($$0);
   }

   public void a(fjj $$0, gqa $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, bwx.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, bwx.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hfq $$1, bwx $$2, fjj $$3, gqa $$4, int $$5) {
      if (!$$1.c()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == bwx.a;
         $$3.a((float)($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hin.d);
         $$3.b();
      }
   }
}

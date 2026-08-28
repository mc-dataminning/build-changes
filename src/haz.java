public class haz<S extends hcd, M extends ggk<S> & gfa> extends hbh<S, M> {
   public haz(gyq<S, M> $$0) {
      super($$0);
   }

   public void a(fjy $$0, gqm $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, bxa.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, bxa.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hgc $$1, bxa $$2, fjy $$3, gqm $$4, int $$5) {
      if (!$$1.c()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == bxa.a;
         $$3.a((float)($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hja.d);
         $$3.b();
      }
   }
}

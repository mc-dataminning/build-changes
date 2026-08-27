public class gap extends gak<bxu, fju<bxu>> {
   private final frt a;
   private final fxa b;

   public gap(fxx<bxu, fju<bxu>> $$0, frt $$1, fxa $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(eob $$0, fqz $$1, int $$2, bxu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = eti.N().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            clo $$12 = new clo(cvh.ee);
            if ($$10) {
               dhn $$13 = cvh.ee.o();
               gea $$14 = this.a.a($$13);
               int $$15 = fxd.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(frh.q(gby.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cll.f, false, $$0, $$1, $$3.dN(), $$2, fxd.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}

public class ggi implements gfx<dqp> {
   private final ftq a;

   public ggi(gfy.a $$0) {
      this.a = new ftq($$0.a(fxh.r));
   }

   public void a(dqp $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      dsh $$6 = $$0.n();
      if ($$6.c(djq.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(djq.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         fak $$8 = ggg.a.a($$3, gef::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}

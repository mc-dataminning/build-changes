public class gck implements gbz<dnh> {
   private final fpu a;

   public gck(gca.a $$0) {
      this.a = new fpu($$0.a(ftl.r));
   }

   public void a(dnh $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      doz $$6 = $$0.n();
      if ($$6.c(dgi.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(dgi.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         ewm $$8 = gci.a.a($$3, gah::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}

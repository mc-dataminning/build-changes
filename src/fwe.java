public class fwe implements fvt<dif> {
   private final fjr a;

   public fwe(fvu.a $$0) {
      this.a = new fjr($$0.a(fni.n));
   }

   public void a(dif $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      djp $$6 = $$0.r();
      if ($$6.c(dbi.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(dbi.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         eqo $$8 = fwc.a.a($$3, fub::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}

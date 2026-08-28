public class gmm extends gks<ckg, fxd<ckg>> {
   private static final akk a = new akk("textures/entity/witch.png");

   public gmm(gjm.a $$0) {
      super($$0, new fxd<>($$0.a(fxn.bU)), 0.5F);
      this.a(new gol<>(this, $$0.d()));
   }

   public void a(ckg $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      this.f.b(!$$0.eU().e());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(ckg $$0) {
      return a;
   }

   protected void a(ckg $$0, fam $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}

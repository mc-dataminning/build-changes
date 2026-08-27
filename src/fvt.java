public class fvt extends fxd<cay, fhn<cay>> {
   private static final agi a = new agi("textures/entity/enderman/enderman.png");
   private final ats i = ats.a();

   public fvt(fvx.a $$0) {
      super($$0, new fhn<>($$0.a(fkn.R)), 0.5F);
      this.a(new fzp<>(this));
      this.a(new fzg(this, $$0.c()));
   }

   public void a(cay $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      dhi $$6 = $$0.gf();
      fhn<cay> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eju a(cay $$0, float $$1) {
      if ($$0.gg()) {
         double $$2 = 0.02;
         return new eju(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public agi a(cay $$0) {
      return a;
   }
}

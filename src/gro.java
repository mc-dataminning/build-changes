public class gro extends gth<cli, gya, gbq> {
   private static final aku a = aku.b("textures/entity/creeper/creeper.png");

   public gro(gsb.a $$0) {
      super($$0, new gbq($$0.a(gez.ai)), 0.5F);
      this.a(new gvs(this, $$0.f()));
   }

   protected void a(gya $$0, ffs $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + ayy.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = ayy.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gya $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : ayy.a($$1, 0.5F, 1.0F);
   }

   public aku b(gya $$0) {
      return a;
   }

   public gya a() {
      return new gya();
   }

   public void a(cli $$0, gya $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}

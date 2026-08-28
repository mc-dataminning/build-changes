public class gyg extends gzb<cpf, hgv, gib<hgv>> {
   private static final alr a = alr.b("textures/entity/zombie/zombie.png");

   public gyg(gxv.a $$0, float $$1) {
      super($$0, new ghu($$0.a(gkq.bc)), 0.5F * $$1);
      this.a(new hcb<>(this));
      this.a(new hby<>(this, new ghu($$0.a(gkq.bd)), new ghu($$0.a(gkq.be)), $$0.h()));
   }

   public alr a(hgv $$0) {
      return a;
   }

   public hgv b() {
      return new hgv();
   }

   public void a(cpf $$0, hgv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gym.a($$0, $$1, $$2, this.h);
   }
}

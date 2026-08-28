public class gqe extends gpf<chk, gva, fzz> {
   private static final alh a = alh.b("textures/entity/snow_golem.png");

   public gqe(gnz.a $$0) {
      super($$0, new fzz($$0.a(gba.cw)), 0.5F);
      this.a(new gsr(this, $$0.d(), $$0.b()));
   }

   @Override
   public alh b(gva $$0) {
      return a;
   }

   public gva c() {
      return new gva();
   }

   public void a(chk $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cvx(cwb.fl) : cvx.k;
      $$1.an = this.i.a($$1.ao, $$0, cvv.f);
   }
}

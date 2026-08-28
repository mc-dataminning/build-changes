public class gpo extends gop<cgy, guj, fzk> {
   private static final alc a = alc.b("textures/entity/snow_golem.png");

   public gpo(gnj.a $$0) {
      super($$0, new fzk($$0.a(gak.cw)), 0.5F);
      this.a(new gsb(this, $$0.d(), $$0.b()));
   }

   public alc g(guj $$0) {
      return a;
   }

   public guj c() {
      return new guj();
   }

   public void a(cgy $$0, guj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cvp(cvt.fl) : cvp.k;
      $$1.an = this.i.a($$1.ao, $$0, cvm.f);
   }
}

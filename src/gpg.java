public class gpg extends gqq<clo, gvn, fzh<gvn>> {
   private static final alj a = alj.b("textures/entity/enderman/enderman.png");
   private final azu b = azu.a();

   public gpg(gpk.a $$0) {
      super($$0, new fzh<>($$0.a(gck.aD)), 0.5F);
      this.a(new gth(this));
      this.a(new gsz(this, $$0.d()));
   }

   public ezy a(gvn $$0) {
      ezy $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alj b(gvn $$0) {
      return a;
   }

   public gvn a() {
      return new gvn();
   }

   public void a(clo $$0, gvn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gqb.a($$0, $$1, $$2);
      $$1.a = $$0.gn();
      $$1.b = $$0.gm();
   }
}

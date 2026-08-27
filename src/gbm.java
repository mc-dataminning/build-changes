public class gbm extends fyz<cgu> {
   public static final ahh a = new ahh("textures/entity/trident.png");
   private final fmo f;

   public gbm(fza.a $$0) {
      super($$0);
      this.f = new fmo($$0.a(fni.bE));
   }

   public void a(cgu $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aup.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aup.i($$2, $$0.O, $$0.dD()) + 90.0F));
      eqo $$6 = fzy.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahh a(cgu $$0) {
      return a;
   }
}

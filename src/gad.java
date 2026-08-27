public class gad extends fyz<cgh> {
   private static final ahh a = new ahh("textures/entity/llama/spit.png");
   private final fld<cgh> f;

   public gad(fza.a $$0) {
      super($$0);
      this.f = new fld<>($$0.a(fni.av));
   }

   public void a(cgh $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aup.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aup.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eqo $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahh a(cgh $$0) {
      return a;
   }
}

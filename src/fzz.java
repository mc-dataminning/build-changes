public class fzz extends fyz<cbv> {
   private static final ahh a = new ahh("textures/entity/lead_knot.png");
   private final fla<cbv> f;

   public fzz(fza.a $$0) {
      super($$0);
      this.f = new fla<>($$0.a(fni.as));
   }

   public void a(cbv $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eqo $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahh a(cbv $$0) {
      return a;
   }
}

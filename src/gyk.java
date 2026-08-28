public class gyk extends gut<com, hef, ghv> {
   private static final alg a = alg.b("textures/entity/strider/strider.png");
   private static final alg j = alg.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gyk(gvz.a $$0) {
      super($$0, new ghv($$0.a(git.dr)), new ghv($$0.a(git.dt)), 0.5F);
      this.a(new hap<>(this, $$0.h(), hkv.d.h, $$0x -> $$0x.a, new ghv($$0.a(git.ds)), new ghv($$0.a(git.du))));
   }

   public alg a(hef $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hef $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hef b() {
      return new hef();
   }

   public void a(com $$0, hef $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwn.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.ca();
   }

   protected boolean c(hef $$0) {
      return super.a($$0) || $$0.b;
   }
}

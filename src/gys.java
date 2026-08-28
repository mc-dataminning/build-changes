public class gys extends gvb<cor, hen, gid> {
   private static final alg a = alg.b("textures/entity/strider/strider.png");
   private static final alg j = alg.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gys(gwh.a $$0) {
      super($$0, new gid($$0.a(gjb.dt)), new gid($$0.a(gjb.dv)), 0.5F);
      this.a(new hax<>(this, $$0.h(), hld.d.h, $$0x -> $$0x.a, new gid($$0.a(gjb.du)), new gid($$0.a(gjb.dw))));
   }

   public alg a(hen $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hen $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hen b() {
      return new hen();
   }

   public void a(cor $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwp.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.ca();
   }

   protected boolean c(hen $$0) {
      return super.a($$0) || $$0.b;
   }
}

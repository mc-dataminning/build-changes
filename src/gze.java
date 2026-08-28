public class gze extends gvn<coy, hez, gip> {
   private static final alg a = alg.b("textures/entity/strider/strider.png");
   private static final alg j = alg.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gze(gwt.a $$0) {
      super($$0, new gip($$0.a(gjn.dt)), new gip($$0.a(gjn.dv)), 0.5F);
      this.a(new hbj<>(this, $$0.h(), hlp.d.h, $$0x -> $$0x.a, new gip($$0.a(gjn.du)), new gip($$0.a(gjn.dw))));
   }

   public alg a(hez $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hez $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hez b() {
      return new hez();
   }

   public void a(coy $$0, hez $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bws.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.bY();
   }

   protected boolean c(hez $$0) {
      return super.a($$0) || $$0.b;
   }
}

public class gih extends ggx<cdi, fqn<cdi>> {
   private final fqn<cdi> a = this.a();
   private final fqn<cdi> i;
   private static final ajv j = new ajv("textures/entity/fish/tropical_a.png");
   private static final ajv k = new ajv("textures/entity/fish/tropical_b.png");

   public gih(gfr.a $$0) {
      super($$0, new ftb<>($$0.a(ftu.bL)), 0.15F);
      this.i = new ftc<>($$0.a(ftu.bJ));
      this.a(new gkm(this, $$0.f()));
   }

   public ajv a(cdi $$0) {
      return switch ($$0.gy().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cdi $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      fqn<cdi> $$6 = switch ($$0.gy().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gw().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cdi $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

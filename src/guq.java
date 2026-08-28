public class guq extends grp<crg, gxv> {
   private static final alz a = alz.b("textures/entity/projectiles/wind_charge.png");
   private final gea b;

   public guq(grq.a $$0) {
      super($$0);
      this.b = new gea($$0.a(gen.ds));
   }

   @Override
   public void a(gxv $$0, fgs $$1, gll $$2, int $$3) {
      fgw $$4 = $$2.getBuffer(glv.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hbc.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gxv d() {
      return new gxv();
   }
}

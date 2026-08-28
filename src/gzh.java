public class gzh extends gwg<cso, hcn> {
   private static final alg a = alg.b("textures/entity/projectiles/wind_charge.png");
   private final gio g;

   public gzh(gwh.a $$0) {
      super($$0);
      this.g = new gio($$0.a(gjb.dQ));
   }

   @Override
   public void a(hcn $$0, fjj $$1, gqa $$2, int $$3) {
      fjn $$4 = $$2.getBuffer(gqk.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hin.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hcn d() {
      return new hcn();
   }
}

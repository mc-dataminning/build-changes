public class gzu extends hav<hca, gfe> {
   private static final alg a = alg.b("textures/entity/breeze/breeze_wind.png");
   private final gfe b;

   public gzu(gwh.a $$0, gye<hca, gfe> $$1) {
      super($$1);
      this.b = new gfe($$0.a(gjb.L));
   }

   public void a(fjj $$0, gqa $$1, int $$2, hca $$3, float $$4, float $$5) {
      fjn $$6 = $$1.getBuffer(gqk.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gvm.a(this.b, this.b.d()).a($$0, $$6, $$2, hin.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}

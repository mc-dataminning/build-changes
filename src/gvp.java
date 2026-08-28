public class gvp extends gwr<gxw, gbk> {
   private static final aku a = aku.b("textures/entity/breeze/breeze_wind.png");
   private final gbk b;

   public gvp(gsc.a $$0, gtz<gxw, gbk> $$1) {
      super($$1);
      this.b = new gbk($$0.a(gfb.L));
   }

   public void a(ffu $$0, glx $$1, int $$2, gxw $$3, float $$4, float $$5) {
      ffy $$6 = $$1.getBuffer(gmh.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      grh.a(this.b, this.b.d()).a($$0, $$6, $$2, hea.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}

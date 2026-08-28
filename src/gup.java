public class gup extends gro<crf, gxu> {
   private static final alz a = alz.b("textures/entity/projectiles/wind_charge.png");
   private final gdz b;

   public gup(grp.a $$0) {
      super($$0);
      this.b = new gdz($$0.a(gem.ds));
   }

   @Override
   public void a(gxu $$0, fgr $$1, glk $$2, int $$3) {
      fgv $$4 = $$2.getBuffer(glu.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hbb.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gxu d() {
      return new gxu();
   }
}

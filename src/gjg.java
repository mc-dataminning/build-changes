public class gjg extends gkb<cjw, ful<cjw>> {
   private static final ale a = new ale("textures/entity/zombie/zombie.png");
   private final float i;

   public gjg(giv.a $$0, float $$1) {
      super($$0, new fud($$0.a(fwx.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gna<>(this, $$0.d()));
      this.a(new gmx<>(this, new fud($$0.a(fwx.ai)), new fud($$0.a(fwx.aj)), $$0.g()));
   }

   protected void a(cjw $$0, ezw $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ale a(cjw $$0) {
      return a;
   }
}

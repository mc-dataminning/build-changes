public class fuo extends fvj<cag, fgk<cag>> {
   private static final afw a = new afw("textures/entity/zombie/zombie.png");
   private final float i;

   public fuo(fud.a $$0, float $$1) {
      super($$0, new fgc($$0.a(fiv.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fye<>(this, $$0.d()));
      this.a(new fyb<>(this, new fgc($$0.a(fiv.ac)), new fgc($$0.a(fiv.ad)), $$0.g()));
   }

   protected void a(cag $$0, emh $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public afw a(cag $$0) {
      return a;
   }
}

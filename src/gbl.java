public class gbl extends gcg<cem, fmv<cem>> {
   private static final aiy a = new aiy("textures/entity/zombie/zombie.png");
   private final float i;

   public gbl(gba.a $$0, float $$1) {
      super($$0, new fmn($$0.a(fpi.ad)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gfe<>(this, $$0.d()));
      this.a(new gfb<>(this, new fmn($$0.a(fpi.ae)), new fmn($$0.a(fpi.af)), $$0.g()));
   }

   protected void a(cem $$0, esh $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aiy a(cem $$0) {
      return a;
   }
}

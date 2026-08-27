public class gbd extends gby<cei, fmo<cei>> {
   private static final aiy a = new aiy("textures/entity/zombie/zombie.png");
   private final float i;

   public gbd(gas.a $$0, float $$1) {
      super($$0, new fmg($$0.a(fpb.ad)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gew<>(this, $$0.d()));
      this.a(new get<>(this, new fmg($$0.a(fpb.ae)), new fmg($$0.a(fpb.af)), $$0.g()));
   }

   protected void a(cei $$0, esa $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public aiy a(cei $$0) {
      return a;
   }
}

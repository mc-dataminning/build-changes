public class guw<T extends coy> extends gwq<T, hbh, geu> {
   private static final ale a = ale.b("textures/entity/creaking/creaking.png");
   private static final ale j = ale.b("textures/entity/creaking/creaking_eyes.png");

   public guw(gvk.a $$0) {
      super($$0, new geu($$0.a(gif.al)), 0.6F);
      this.a(new gzr<>(this, j, ($$0x, $$1) -> 1.0F, geu::b, gpn::q, true));
   }

   public ale a(hbh $$0) {
      return a;
   }

   public hbh a() {
      return new hbh();
   }

   public void a(T $$0, hbh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bH);
      $$1.a.a($$0.bI);
      $$1.c.a($$0.bJ);
      if ($$0.gr()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gu();
      } else {
         $$1.d = $$0.gy();
      }

      $$1.e = $$0.n();
   }
}

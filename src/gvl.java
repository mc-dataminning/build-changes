public class gvl<T extends cpe> extends gxf<T, hbx, gfh> {
   private static final alg a = alg.b("textures/entity/creaking/creaking.png");
   private static final alg j = alg.b("textures/entity/creaking/creaking_eyes.png");

   public gvl(gvz.a $$0) {
      super($$0, new gfh($$0.a(git.an)), 0.6F);
      this.a(new hag<>(this, j, ($$0x, $$1) -> 1.0F, gfh::b, gqc::q, true));
   }

   public alg a(hbx $$0) {
      return a;
   }

   public hbx a() {
      return new hbx();
   }

   public void a(T $$0, hbx $$1, float $$2) {
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

public class gzh extends gwq<cou, hew, gil<hew>> {
   private static final alg a = alg.b("textures/entity/zombie_villager/zombie_villager.png");

   public gzh(gvz.a $$0) {
      super($$0, new gil<>($$0.a(git.eo)), new gil<>($$0.a(git.ep)), 0.5F, gyv.a);
      this.a(new hac<>(this, new gil($$0.a(git.es)), new gil($$0.a(git.et)), new gil($$0.a(git.eq)), new gil($$0.a(git.er)), $$0.h()));
      this.a(new hax<>(this, $$0.e(), "zombie_villager"));
   }

   public alg a(hew $$0) {
      return a;
   }

   public hew b() {
      return new hew();
   }

   public void a(cou $$0, hew $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gh();
   }

   protected boolean b(hew $$0) {
      return super.a($$0) || $$0.b;
   }
}

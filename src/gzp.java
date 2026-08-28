public class gzp extends gwy<coy, hfe, git<hfe>> {
   private static final alg a = alg.b("textures/entity/zombie_villager/zombie_villager.png");

   public gzp(gwh.a $$0) {
      super($$0, new git<>($$0.a(gjb.eq)), new git<>($$0.a(gjb.er)), 0.5F, gzd.a);
      this.a(new hak<>(this, new git($$0.a(gjb.eu)), new git($$0.a(gjb.ev)), new git($$0.a(gjb.es)), new git($$0.a(gjb.et)), $$0.h()));
      this.a(new hbf<>(this, $$0.e(), "zombie_villager"));
   }

   public alg a(hfe $$0) {
      return a;
   }

   public hfe b() {
      return new hfe();
   }

   public void a(coy $$0, hfe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gy();
      $$1.c = $$0.gz();
      $$1.a = $$0.gi();
   }

   protected boolean b(hfe $$0) {
      return super.a($$0) || $$0.b;
   }
}

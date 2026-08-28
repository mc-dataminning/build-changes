public class gxn extends guw<cod, hdb, ggu<hdb>> {
   private static final ald a = ald.b("textures/entity/zombie_villager/zombie_villager.png");

   public gxn(guf.a $$0) {
      super($$0, new ggu<>($$0.a(ghc.ek)), new ggu<>($$0.a(ghc.el)), 0.5F, gxb.a);
      this.a(new gyi<>(this, new ggu($$0.a(ghc.eo)), new ggu($$0.a(ghc.ep)), new ggu($$0.a(ghc.em)), new ggu($$0.a(ghc.en)), $$0.h()));
      this.a(new gzd<>(this, $$0.e(), "zombie_villager"));
   }

   public ald a(hdb $$0) {
      return a;
   }

   public hdb b() {
      return new hdb();
   }

   public void a(cod $$0, hdb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gh();
   }

   protected boolean b(hdb $$0) {
      return super.a($$0) || $$0.b;
   }
}

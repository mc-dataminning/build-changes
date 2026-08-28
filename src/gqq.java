public class gqq extends goa<clu, gwb, gac<gwb>> {
   private static final alc a = alc.b("textures/entity/zombie_villager/zombie_villager.png");

   public gqq(gnj.a $$0) {
      super($$0, new gac<>($$0.a(gak.dv)), new gac<>($$0.a(gak.dy)), 0.5F, gqe.a);
      this.a(new grm<>(this, new gac($$0.a(gak.dw)), new gac($$0.a(gak.dx)), new gac($$0.a(gak.dz)), new gac($$0.a(gak.dA)), $$0.g()));
      this.a(new gsg<>(this, $$0.e(), "zombie_villager"));
   }

   public alc a(gwb $$0) {
      return a;
   }

   public gwb c() {
      return new gwb();
   }

   public void a(clu $$0, gwb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gy();
      $$1.c = $$0.gz();
      $$1.a = $$0.gg();
   }

   protected boolean b(gwb $$0) {
      return super.a($$0) || $$0.b;
   }
}

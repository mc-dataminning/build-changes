public class gqv extends gof<clx, gwg, gah<gwg>> {
   private static final ale a = ale.b("textures/entity/zombie_villager/zombie_villager.png");

   public gqv(gno.a $$0) {
      super($$0, new gah<>($$0.a(gap.dv)), new gah<>($$0.a(gap.dy)), 0.5F, gqj.a);
      this.a(new grr<>(this, new gah($$0.a(gap.dw)), new gah($$0.a(gap.dx)), new gah($$0.a(gap.dz)), new gah($$0.a(gap.dA)), $$0.g()));
      this.a(new gsl<>(this, $$0.e(), "zombie_villager"));
   }

   public ale a(gwg $$0) {
      return a;
   }

   public gwg c() {
      return new gwg();
   }

   public void a(clx $$0, gwg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
   }

   protected boolean b(gwg $$0) {
      return super.a($$0) || $$0.b;
   }
}

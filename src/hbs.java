public class hbs extends gzb<cpv, hhi, gkx<hhi>> {
   private static final alk a = alk.b("textures/entity/zombie_villager/zombie_villager.png");

   public hbs(gyk.a $$0) {
      super($$0, new gkx<>($$0.a(glf.es)), new gkx<>($$0.a(glf.et)), 0.5F, hbg.a);
      this.a(new hcn<>(this, new gkx($$0.a(glf.ew)), new gkx($$0.a(glf.ex)), new gkx($$0.a(glf.eu)), new gkx($$0.a(glf.ev)), $$0.h()));
      this.a(new hdj<>(this, $$0.e(), "zombie_villager"));
   }

   public alk a(hhi $$0) {
      return a;
   }

   public hhi b() {
      return new hhi();
   }

   public void a(cpv $$0, hhi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gB();
      $$1.c = $$0.gC();
      $$1.a = $$0.gl();
   }

   protected boolean b(hhi $$0) {
      return super.a($$0) || $$0.b;
   }
}

public class hbq extends gyz<cpt, hhg, gkv<hhg>> {
   private static final ali a = ali.b("textures/entity/zombie_villager/zombie_villager.png");

   public hbq(gyi.a $$0) {
      super($$0, new gkv<>($$0.a(gld.es)), new gkv<>($$0.a(gld.et)), 0.5F, hbe.a);
      this.a(new hcl<>(this, new gkv($$0.a(gld.ew)), new gkv($$0.a(gld.ex)), new gkv($$0.a(gld.eu)), new gkv($$0.a(gld.ev)), $$0.h()));
      this.a(new hdh<>(this, $$0.e(), "zombie_villager"));
   }

   public ali a(hhg $$0) {
      return a;
   }

   public hhg b() {
      return new hhg();
   }

   public void a(cpt $$0, hhg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gB();
      $$1.c = $$0.gC();
      $$1.a = $$0.gl();
   }

   protected boolean b(hhg $$0) {
      return super.a($$0) || $$0.b;
   }
}

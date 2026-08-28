public class gux extends gsg<cnq, hak, gee<hak>> {
   private static final alz a = alz.b("textures/entity/zombie_villager/zombie_villager.png");

   public gux(grp.a $$0) {
      super($$0, new gee<>($$0.a(gem.dQ)), new gee<>($$0.a(gem.dR)), 0.5F, gul.a);
      this.a(new gvt<>(this, new gee($$0.a(gem.dU)), new gee($$0.a(gem.dV)), new gee($$0.a(gem.dS)), new gee($$0.a(gem.dT)), $$0.h()));
      this.a(new gwo<>(this, $$0.e(), "zombie_villager"));
   }

   public alz a(hak $$0) {
      return a;
   }

   public hak b() {
      return new hak();
   }

   public void a(cnq $$0, hak $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gd();
   }

   protected boolean b(hak $$0) {
      return super.a($$0) || $$0.b;
   }
}

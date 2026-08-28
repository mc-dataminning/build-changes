public class guw extends gsf<cnq, haj, ged<haj>> {
   private static final alz a = alz.b("textures/entity/zombie_villager/zombie_villager.png");

   public guw(gro.a $$0) {
      super($$0, new ged<>($$0.a(gel.dQ)), new ged<>($$0.a(gel.dR)), 0.5F, guk.a);
      this.a(new gvs<>(this, new ged($$0.a(gel.dU)), new ged($$0.a(gel.dV)), new ged($$0.a(gel.dS)), new ged($$0.a(gel.dT)), $$0.h()));
      this.a(new gwn<>(this, $$0.e(), "zombie_villager"));
   }

   public alz a(haj $$0) {
      return a;
   }

   public haj b() {
      return new haj();
   }

   public void a(cnq $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gv();
      $$1.c = $$0.gw();
      $$1.a = $$0.gb();
   }

   protected boolean b(haj $$0) {
      return super.a($$0) || $$0.b;
   }
}

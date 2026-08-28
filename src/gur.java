public class gur extends gsa<cnm, hae, gdy<hae>> {
   private static final alz a = alz.b("textures/entity/zombie_villager/zombie_villager.png");

   public gur(grj.a $$0) {
      super($$0, new gdy<>($$0.a(geg.dQ)), new gdy<>($$0.a(geg.dR)), 0.5F, guf.a);
      this.a(new gvn<>(this, new gdy($$0.a(geg.dU)), new gdy($$0.a(geg.dV)), new gdy($$0.a(geg.dS)), new gdy($$0.a(geg.dT)), $$0.h()));
      this.a(new gwi<>(this, $$0.e(), "zombie_villager"));
   }

   public alz a(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(cnm $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gv();
      $$1.c = $$0.gw();
      $$1.a = $$0.gb();
   }

   protected boolean b(hae $$0) {
      return super.a($$0) || $$0.b;
   }
}

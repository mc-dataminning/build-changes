public class hbd extends gym<cqe, hgw, gki<hgw>> {
   private static final alr a = alr.b("textures/entity/zombie_villager/zombie_villager.png");

   public hbd(gxv.a $$0) {
      super($$0, new gki<>($$0.a(gkq.es)), new gki<>($$0.a(gkq.et)), 0.5F, har.a);
      this.a(new hby<>(this, new gki($$0.a(gkq.ew)), new gki($$0.a(gkq.ex)), new gki($$0.a(gkq.eu)), new gki($$0.a(gkq.ev)), $$0.h()));
      this.a(new hcu<>(this, $$0.e(), "zombie_villager"));
   }

   public alr a(hgw $$0) {
      return a;
   }

   public hgw b() {
      return new hgw();
   }

   public void a(cqe $$0, hgw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gE();
      $$1.c = $$0.gF();
      $$1.a = $$0.gl();
   }

   protected boolean b(hgw $$0) {
      return super.a($$0) || $$0.b;
   }
}

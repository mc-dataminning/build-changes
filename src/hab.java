public class hab extends gxk<cpf, hfq, gjf<hfq>> {
   private static final alg a = alg.b("textures/entity/zombie_villager/zombie_villager.png");

   public hab(gwt.a $$0) {
      super($$0, new gjf<>($$0.a(gjn.eq)), new gjf<>($$0.a(gjn.er)), 0.5F, gzp.a);
      this.a(new haw<>(this, new gjf($$0.a(gjn.eu)), new gjf($$0.a(gjn.ev)), new gjf($$0.a(gjn.es)), new gjf($$0.a(gjn.et)), $$0.h()));
      this.a(new hbr<>(this, $$0.e(), "zombie_villager"));
   }

   public alg a(hfq $$0) {
      return a;
   }

   public hfq b() {
      return new hfq();
   }

   public void a(cpf $$0, hfq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gA();
      $$1.c = $$0.gB();
      $$1.a = $$0.gk();
   }

   protected boolean b(hfq $$0) {
      return super.a($$0) || $$0.b;
   }
}

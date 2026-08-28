public class grr extends gpb<cml, gxd, gbd<gxd>> {
   private static final ali a = ali.b("textures/entity/zombie_villager/zombie_villager.png");

   public grr(gok.a $$0) {
      super($$0, new gbd<>($$0.a(gbl.dv)), new gbd<>($$0.a(gbl.dy)), 0.5F, grf.a);
      this.a(new gsn<>(this, new gbd($$0.a(gbl.dw)), new gbd($$0.a(gbl.dx)), new gbd($$0.a(gbl.dz)), new gbd($$0.a(gbl.dA)), $$0.h()));
      this.a(new gth<>(this, $$0.e(), "zombie_villager"));
   }

   public ali a(gxd $$0) {
      return a;
   }

   public gxd c() {
      return new gxd();
   }

   public void a(cml $$0, gxd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gD();
      $$1.c = $$0.gE();
      $$1.a = $$0.gj();
   }

   protected boolean b(gxd $$0) {
      return super.a($$0) || $$0.b;
   }
}

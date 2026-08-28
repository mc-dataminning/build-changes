public class hag extends gxp<cpi, hfw, gjk<hfw>> {
   private static final alg a = alg.b("textures/entity/zombie_villager/zombie_villager.png");

   public hag(gwy.a $$0) {
      super($$0, new gjk<>($$0.a(gjs.es)), new gjk<>($$0.a(gjs.et)), 0.5F, gzu.a);
      this.a(new hbb<>(this, new gjk($$0.a(gjs.ew)), new gjk($$0.a(gjs.ex)), new gjk($$0.a(gjs.eu)), new gjk($$0.a(gjs.ev)), $$0.h()));
      this.a(new hbx<>(this, $$0.e(), "zombie_villager"));
   }

   public alg a(hfw $$0) {
      return a;
   }

   public hfw b() {
      return new hfw();
   }

   public void a(cpi $$0, hfw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gA();
      $$1.c = $$0.gB();
      $$1.a = $$0.gk();
   }

   protected boolean b(hfw $$0) {
      return super.a($$0) || $$0.b;
   }
}

public class gve extends gtj<cmn, haw, gep> {
   private static final akv a = akv.b("textures/entity/witch.png");

   public gve(gsd.a $$0) {
      super($$0, new gep($$0.a(gfb.dz)), 0.5F);
      this.a(new gxe(this));
   }

   public akv a(haw $$0) {
      return a;
   }

   public haw b() {
      return new haw();
   }

   public void a(cmn $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyy.a($$0, $$1, this.i);
      $$1.a = $$0.ar();
      cwo $$3 = $$0.eZ();
      $$1.b = !$$3.f();
      $$1.c = $$3.a(cws.ti);
   }
}

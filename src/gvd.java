public class gvd extends gti<cmn, hav, gep> {
   private static final aku a = aku.b("textures/entity/witch.png");

   public gvd(gsc.a $$0) {
      super($$0, new gep($$0.a(gfb.dz)), 0.5F);
      this.a(new gxd(this));
   }

   public aku a(hav $$0) {
      return a;
   }

   public hav b() {
      return new hav();
   }

   public void a(cmn $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyx.a($$0, $$1, this.i);
      $$1.a = $$0.ar();
      cwp $$3 = $$0.eZ();
      $$1.b = !$$3.f();
      $$1.c = $$3.a(cwt.ti);
   }
}

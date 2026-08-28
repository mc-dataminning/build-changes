public class gvg extends gtl<cmp, hay, ger> {
   private static final akv a = akv.b("textures/entity/witch.png");

   public gvg(gsf.a $$0) {
      super($$0, new ger($$0.a(gfd.dz)), 0.5F);
      this.a(new gxg(this));
   }

   public akv a(hay $$0) {
      return a;
   }

   public hay b() {
      return new hay();
   }

   public void a(cmp $$0, hay $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gza.a($$0, $$1, this.i);
      $$1.a = $$0.ar();
      cwq $$3 = $$0.eZ();
      $$1.b = !$$3.f();
      $$1.c = $$3.a(cwu.ti);
   }
}

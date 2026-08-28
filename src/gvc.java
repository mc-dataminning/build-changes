public class gvc extends gth<cmm, hau, gen> {
   private static final aku a = aku.b("textures/entity/witch.png");

   public gvc(gsb.a $$0) {
      super($$0, new gen($$0.a(gez.dz)), 0.5F);
      this.a(new gxc(this));
   }

   public aku a(hau $$0) {
      return a;
   }

   public hau b() {
      return new hau();
   }

   public void a(cmm $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyw.a($$0, $$1, this.i);
      $$1.a = $$0.ar();
      cwn $$3 = $$0.eZ();
      $$1.b = !$$3.f();
      $$1.c = $$3.a(cwr.ti);
   }
}

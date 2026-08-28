public class gxc extends gvy<crr, hdh> {
   private static final alg a = alg.b("textures/entity/llama/spit.png");
   private final ggk g;

   public gxc(gvz.a $$0) {
      super($$0);
      this.g = new ggk($$0.a(git.bG));
   }

   public void a(hdh $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fjg $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hdh a() {
      return new hdh();
   }

   public void a(crr $$0, hdh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}

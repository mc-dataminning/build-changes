public class gxw extends gws<csd, heb> {
   private static final alg a = alg.b("textures/entity/llama/spit.png");
   private final ghe g;

   public gxw(gwt.a $$0) {
      super($$0);
      this.g = new ghe($$0.a(gjn.bI));
   }

   public void a(heb $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fkc $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public heb a() {
      return new heb();
   }

   public void a(csd $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}

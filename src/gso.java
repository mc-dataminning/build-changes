public class gso extends grk<cqg, gyq> {
   private static final alp a = alp.b("textures/entity/llama/spit.png");
   private final gca b;

   public gso(grl.a $$0) {
      super($$0);
      this.b = new gca($$0.a(gei.bw));
   }

   public void a(gyq $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgp $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hax.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyq a() {
      return new gyq();
   }

   public void a(cqg $$0, gyq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

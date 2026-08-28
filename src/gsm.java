public class gsm extends gri<cqk, gyo> {
   private static final alz a = alz.b("textures/entity/llama/spit.png");
   private final gby b;

   public gsm(grj.a $$0) {
      super($$0);
      this.b = new gby($$0.a(geg.bt));
   }

   public void a(gyo $$0, fgl $$1, gle $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgp $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hav.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyo a() {
      return new gyo();
   }

   public void a(cqk $$0, gyo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

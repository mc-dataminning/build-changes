public class gth extends gsd<cpp, gzm> {
   private static final akv a = akv.b("textures/entity/llama/spit.png");
   private final gcu b;

   public gth(gse.a $$0) {
      super($$0);
      this.b = new gcu($$0.a(gfc.bw));
   }

   public void a(gzm $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      ffy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzm a() {
      return new gzm();
   }

   public void a(cpp $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

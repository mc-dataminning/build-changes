public class gtf extends gsb<cpp, gzk> {
   private static final aku a = aku.b("textures/entity/llama/spit.png");
   private final gct b;

   public gtf(gsc.a $$0) {
      super($$0);
      this.b = new gct($$0.a(gfb.bw));
   }

   public void a(gzk $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      ffy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hea.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzk a() {
      return new gzk();
   }

   public void a(cpp $$0, gzk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

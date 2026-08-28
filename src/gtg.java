public class gtg extends gsc<cpo, gzl> {
   private static final akv a = akv.b("textures/entity/llama/spit.png");
   private final gct b;

   public gtg(gsd.a $$0) {
      super($$0);
      this.b = new gct($$0.a(gfb.bw));
   }

   public void a(gzl $$0, fft $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      ffx $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, heh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzl a() {
      return new gzl();
   }

   public void a(cpo $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

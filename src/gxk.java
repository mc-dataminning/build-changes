public class gxk extends gwg<crw, hdp> {
   private static final alg a = alg.b("textures/entity/llama/spit.png");
   private final ggs g;

   public gxk(gwh.a $$0) {
      super($$0);
      this.g = new ggs($$0.a(gjb.bI));
   }

   public void a(hdp $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fjn $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hin.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hdp a() {
      return new hdp();
   }

   public void a(crw $$0, hdp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}

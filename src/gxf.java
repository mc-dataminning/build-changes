public class gxf extends gzq<ckv, hdt, ggp> {
   private static final alk a = alk.b("textures/entity/allay/allay.png");

   public gxf(gyk.a $$0) {
      super($$0, new ggp($$0.a(glf.c)), 0.4F);
      this.a(new hcq<>(this));
   }

   public alk a(hdt $$0) {
      return a;
   }

   public hdt a() {
      return new hdt();
   }

   public void a(ckv $$0, hdt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdv.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ckv $$0, iw $$1) {
      return 15;
   }
}

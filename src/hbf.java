public class hbf extends gzq<cpp, hgz, gkn> {
   private static final alk a = alk.b("textures/entity/illager/vex.png");
   private static final alk j = alk.b("textures/entity/illager/vex_charging.png");

   public hbf(gyk.a $$0) {
      super($$0, new gkn($$0.a(glf.dK)), 0.3F);
      this.a(new hcq<>(this));
   }

   protected int a(cpp $$0, iw $$1) {
      return 15;
   }

   public alk a(hgz $$0) {
      return $$0.a ? j : a;
   }

   public hgz b() {
      return new hgz();
   }

   public void a(cpp $$0, hgz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdv.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}

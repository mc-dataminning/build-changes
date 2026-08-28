public class hbd extends gzo<cpn, hgx, gkl> {
   private static final ali a = ali.b("textures/entity/illager/vex.png");
   private static final ali j = ali.b("textures/entity/illager/vex_charging.png");

   public hbd(gyi.a $$0) {
      super($$0, new gkl($$0.a(gld.dK)), 0.3F);
      this.a(new hco<>(this));
   }

   protected int a(cpn $$0, iv $$1) {
      return 15;
   }

   public ali a(hgx $$0) {
      return $$0.a ? j : a;
   }

   public hgx b() {
      return new hgx();
   }

   public void a(cpn $$0, hgx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdt.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}

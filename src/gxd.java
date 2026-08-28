public class gxd extends gzo<ckt, hdr, ggn> {
   private static final ali a = ali.b("textures/entity/allay/allay.png");

   public gxd(gyi.a $$0) {
      super($$0, new ggn($$0.a(gld.c)), 0.4F);
      this.a(new hco<>(this));
   }

   public ali a(hdr $$0) {
      return a;
   }

   public hdr a() {
      return new hdr();
   }

   public void a(ckt $$0, hdr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdt.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ckt $$0, iv $$1) {
      return 15;
   }
}

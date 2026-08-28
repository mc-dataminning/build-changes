public class haq extends gzb<cpy, hgn, gjy> {
   private static final alr a = alr.b("textures/entity/illager/vex.png");
   private static final alr j = alr.b("textures/entity/illager/vex_charging.png");

   public haq(gxv.a $$0) {
      super($$0, new gjy($$0.a(gkq.dK)), 0.3F);
      this.a(new hcb<>(this));
   }

   protected int a(cpy $$0, iw $$1) {
      return 15;
   }

   public alr a(hgn $$0) {
      return $$0.a ? j : a;
   }

   public hgn b() {
      return new hgn();
   }

   public void a(cpy $$0, hgn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdg.a($$0, $$1, this.h);
      $$1.a = $$0.gv();
   }
}

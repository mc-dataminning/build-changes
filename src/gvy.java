public class gvy extends gxz<cph, hcm, gfq> {
   private static final alg a = alg.b("textures/entity/breeze/breeze.png");

   public gvy(gwt.a $$0) {
      super($$0, new gfq($$0.a(gjn.K)), 0.5F);
      this.a(new hag($$0, this));
      this.a(new haf(this));
   }

   public void a(hcm $$0, fjy $$1, gqm $$2, int $$3) {
      gfq $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alg a(hcm $$0) {
      return a;
   }

   public hcm a() {
      return new hcm();
   }

   public void a(cph $$0, hcm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bG);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bH);
      $$1.f.a($$0.d);
   }

   public static gfq a(gfq $$0, gjo... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gjo $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

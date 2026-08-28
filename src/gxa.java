public class gxa extends gzb<cqg, hdp, ggt> {
   private static final alr a = alr.b("textures/entity/breeze/breeze.png");

   public gxa(gxv.a $$0) {
      super($$0, new ggt($$0.a(gkq.K)), 0.5F);
      this.a(new hbi($$0, this));
      this.a(new hbh(this));
   }

   public void a(hdp $$0, fld $$1, grn $$2, int $$3) {
      ggt $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alr a(hdp $$0) {
      return a;
   }

   public hdp a() {
      return new hdp();
   }

   public void a(cqg $$0, hdp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.e);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.f);
      $$1.f.a($$0.d);
   }

   public static ggt a(ggt $$0, gkr... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gkr $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

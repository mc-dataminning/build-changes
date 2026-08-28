public class gxn extends gzo<cpv, hec, ghg> {
   private static final ali a = ali.b("textures/entity/breeze/breeze.png");

   public gxn(gyi.a $$0) {
      super($$0, new ghg($$0.a(gld.K)), 0.5F);
      this.a(new hbv($$0, this));
      this.a(new hbu(this));
   }

   public void a(hec $$0, flo $$1, gsa $$2, int $$3) {
      ghg $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ali a(hec $$0) {
      return a;
   }

   public hec a() {
      return new hec();
   }

   public void a(cpv $$0, hec $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.e);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.f);
      $$1.f.a($$0.d);
   }

   public static ghg a(ghg $$0, gle... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gle $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

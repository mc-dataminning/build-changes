public class grg extends gth<cms, gxv, gbi> {
   private static final aku a = aku.b("textures/entity/breeze/breeze.png");

   public grg(gsb.a $$0) {
      super($$0, new gbi($$0.a(gez.K)), 0.5F);
      this.a(new gvo($$0, this));
      this.a(new gvn(this));
   }

   public void a(gxv $$0, ffs $$1, glv $$2, int $$3) {
      gbi $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public aku a(gxv $$0) {
      return a;
   }

   public gxv a() {
      return new gxv();
   }

   public void a(cms $$0, gxv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bY);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bZ);
      $$1.f.a($$0.d);
   }

   public static gbi a(gbi $$0, gfa... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gfa $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

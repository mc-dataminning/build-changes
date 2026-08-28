public class gsi extends guj<cno, gyx, gcj> {
   private static final aku a = aku.b("textures/entity/breeze/breeze.png");

   public gsi(gtd.a $$0) {
      super($$0, new gcj($$0.a(ggb.K)), 0.5F);
      this.a(new gwq($$0, this));
      this.a(new gwp(this));
   }

   public void a(gyx $$0, fgr $$1, gmx $$2, int $$3) {
      gcj $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public aku a(gyx $$0) {
      return a;
   }

   public gyx a() {
      return new gyx();
   }

   public void a(cno $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bF);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bG);
      $$1.f.a($$0.d);
   }

   public static gcj a(gcj $$0, ggc... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (ggc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

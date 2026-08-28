public class grh extends gti<cmt, gxw, gbk> {
   private static final aku a = aku.b("textures/entity/breeze/breeze.png");

   public grh(gsc.a $$0) {
      super($$0, new gbk($$0.a(gfb.K)), 0.5F);
      this.a(new gvp($$0, this));
      this.a(new gvo(this));
   }

   public void a(gxw $$0, ffu $$1, glx $$2, int $$3) {
      gbk $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public aku a(gxw $$0) {
      return a;
   }

   public gxw a() {
      return new gxw();
   }

   public void a(cmt $$0, gxw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bY);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bZ);
      $$1.f.a($$0.d);
   }

   public static gbk a(gbk $$0, gfc... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gfc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

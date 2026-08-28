public class gnq extends gpq<cmn, guc, fxv> {
   private static final ali a = ali.b("textures/entity/breeze/breeze.png");

   public gnq(gok.a $$0) {
      super($$0, new fxv($$0.a(gbl.B)), 0.5F);
      this.a(new grw($$0, this));
      this.a(new grv(this));
   }

   public void a(guc $$0, feb $$1, gih $$2, int $$3) {
      fxv $$4 = this.e();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ali a(guc $$0) {
      return a;
   }

   public guc a() {
      return new guc();
   }

   public void a(cmn $$0, guc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.e);
   }

   public static fxv a(fxv $$0, gbm... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gbm $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

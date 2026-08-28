public class gwu extends gtd<cqr, hco> {
   public static final ald a = ald.b("textures/entity/projectiles/arrow.png");
   public static final ald g = ald.b("textures/entity/projectiles/tipped_arrow.png");

   public gwu(guf.a $$0) {
      super($$0);
   }

   protected ald a(hco $$0) {
      return $$0.d ? g : a;
   }

   public hco a() {
      return new hco();
   }

   public void a(cqr $$0, hco $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}

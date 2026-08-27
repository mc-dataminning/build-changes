public class gce extends gee<cgu, fnl<cgu>> {
   private static final ajh a = new ajh("textures/entity/breeze/breeze.png");

   public gce(gcy.a $$0) {
      super($$0, new fnl<>($$0.a(frc.o)), 0.5F);
      this.a(new ggi(this));
      this.a(new ggh(this));
   }

   public void a(cgu $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      fnl<cgu> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cgu $$0) {
      return a;
   }

   public static fnl<cgu> a(fnl<cgu> $$0, frd... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (frd $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

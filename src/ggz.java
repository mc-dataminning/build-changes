public class ggz extends giz<cjy, fsf<cjy>> {
   private static final akm a = new akm("textures/entity/breeze/breeze.png");

   public ggz(ght.a $$0) {
      super($$0, new fsf<>($$0.a(fvv.s)), 0.5F);
      this.a(new gle(this));
      this.a(new gld(this));
   }

   public void a(cjy $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      fsf<cjy> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akm a(cjy $$0) {
      return a;
   }

   public static fsf<cjy> a(fsf<cjy> $$0, fvw... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fvw $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

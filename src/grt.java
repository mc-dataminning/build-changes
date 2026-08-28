public class grt<T extends cnh> extends gsj<T, gxy> {
   private static final alz a = alz.b("textures/entity/illager/evoker.png");

   public grt(grq.a $$0) {
      super($$0, new gca<>($$0.a(gen.aI)), 0.5F);
      this.a(new gvx<gxy, gca<gxy>>(this, $$0.b()) {
         public void a(fgs $$0, gll $$1, int $$2, gxy $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gxy $$0) {
      return a;
   }

   public gxy b() {
      return new gxy();
   }

   public void a(T $$0, gxy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}

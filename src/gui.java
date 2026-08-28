public class gui<T extends cnt> extends guy<T, han> {
   private static final ald a = ald.b("textures/entity/illager/evoker.png");

   public gui(guf.a $$0) {
      super($$0, new gep<>($$0.a(ghc.aR)), 0.5F);
      this.a(new gyl<han, gep<han>>(this) {
         public void a(fho $$0, gny $$1, int $$2, han $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ald a(han $$0) {
      return a;
   }

   public han b() {
      return new han();
   }

   public void a(T $$0, han $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}

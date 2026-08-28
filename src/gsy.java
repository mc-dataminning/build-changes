public abstract class gsy<T extends coc, S extends hda, M extends ggt<S>> extends guw<T, S, M> {
   private static final ald a = ald.b("textures/entity/zombie/zombie.png");

   protected gsy(guf.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gyi<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public ald a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gh();
      $$1.b = $$0.gu();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}

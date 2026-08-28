@Deprecated
public abstract class gqw<T extends bvi, S extends gzi, M extends gca<? super S>> extends gti<T, S, M> {
   private final M a;
   private final M b;

   public gqw(gsc.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public void a(S $$0, ffu $$1, glx $$2, int $$3) {
      this.h = $$0.aj ? this.b : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}

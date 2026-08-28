import java.util.Collection;

public abstract class hdo<E extends flk.a<E>> extends flk<E> {
   protected hdo(int $$0, int $$1, int $$2, int $$3) {
      super(fip.Q(), $$0, $$1, $$2, $$3);
   }

   public void p(int $$0) {
      if ($$0 == -1) {
         this.a(null);
      } else if (super.l() != 0) {
         this.a(this.d($$0));
      }
   }

   public void b(int $$0) {
      this.p($$0);
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return (int)((double)this.g * 0.6);
   }

   @Override
   public void a(Collection<E> $$0) {
      super.a($$0);
   }

   @Override
   public int l() {
      return super.l();
   }

   @Override
   public int g(int $$0) {
      return super.g($$0);
   }

   @Override
   public int s() {
      return super.s();
   }

   public int a(E $$0) {
      return super.b($$0);
   }

   public void J() {
      this.k();
   }
}

import java.util.Collection;

public abstract class ghq<E extends evv.a<E>> extends evv<E> {
   protected ghq(int $$0, int $$1, int $$2, int $$3, int $$4) {
      super(etd.N(), $$0, $$1, $$2, $$3, $$4);
   }

   public void k(int $$0) {
      if ($$0 == -1) {
         this.a(null);
      } else if (super.k() != 0) {
         this.a(this.d($$0));
      }
   }

   @Override
   public void a(int $$0) {
      this.k($$0);
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int c() {
      return this.o() + this.b();
   }

   @Override
   public int b() {
      return (int)((double)this.e * 0.6);
   }

   @Override
   public void a(Collection<E> $$0) {
      super.a($$0);
   }

   @Override
   public int k() {
      return super.k();
   }

   @Override
   public int h(int $$0) {
      return super.h($$0);
   }

   @Override
   public int o() {
      return super.o();
   }

   public int a(E $$0) {
      return super.b($$0);
   }

   public void v() {
      this.j();
   }
}

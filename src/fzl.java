import javax.annotation.Nullable;

public abstract class fzl extends fwf {
   protected final fwf b;
   protected final fnh c;
   @Nullable
   protected frk d;
   public final fub s = new fub(this);

   public fzl(fwf $$0, fnh $$1, wv $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aN_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new frk(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fqu $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fqn.a(wu.d, $$0 -> this.aK_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aE_() {
      this.m.n.az();
   }

   @Override
   public void aK_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

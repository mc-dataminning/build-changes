import javax.annotation.Nullable;

public abstract class gao extends fxi {
   protected final fxi b;
   protected final foj c;
   @Nullable
   protected fsn d;
   public final fve s = new fve(this);

   public gao(fxi $$0, foj $$1, ww $$2) {
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
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fsn(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof frx $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(frq.a(wv.d, $$0 -> this.aK_()).a(200).a());
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

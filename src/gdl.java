import javax.annotation.Nullable;

public abstract class gdl extends gaf {
   protected final gaf b;
   protected final frj c;
   @Nullable
   protected fvk d;
   public final fyb s = new fyb(this);

   public gdl(gaf $$0, frj $$1, xc $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aS_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         ful var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fvk(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fuu $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fun.a(xb.d, $$0 -> this.aP_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aJ_() {
      this.m.n.az();
   }

   @Override
   public void aP_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

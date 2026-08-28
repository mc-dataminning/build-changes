import javax.annotation.Nullable;

public abstract class gdj extends gad {
   protected final gad b;
   protected final frh c;
   @Nullable
   protected fvi d;
   public final fxz s = new fxz(this);

   public gdj(gad $$0, frh $$1, xa $$2) {
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
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fvi(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fus $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(ful.a(wz.d, $$0 -> this.aP_()).a(200).a());
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

import javax.annotation.Nullable;

public abstract class fus extends frp {
   protected final frp b;
   protected final fkb c;
   @Nullable
   protected fmt d;
   public final fpl s = new fpl(this);

   public fus(frp $$0, fkb $$1, xl $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aS_() {
      this.F();
      this.E();
      this.D();
      this.s.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   protected void F() {
      this.s.a(this.l, this.p);
   }

   protected void E() {
      this.d = this.s.c(new fmt(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.au()) instanceof fmd $$0) {
         this.q = $$0;
         this.q.j = this.m.aZ().a();
      }
   }

   protected abstract void m();

   protected void D() {
      this.s.b(flw.a(xk.d, $$0 -> this.aP_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void j() {
      this.m.n.ay();
   }

   @Override
   public void aP_() {
      if (this.d != null) {
         this.d.c();
      }

      this.m.a(this.b);
   }
}

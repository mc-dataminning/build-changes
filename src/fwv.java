import javax.annotation.Nullable;

public abstract class fwv extends ftr {
   protected final ftr b;
   protected final fmd c;
   @Nullable
   protected fow d;
   public final frn s = new frn(this);

   public fwv(ftr $$0, fmd $$1, xk $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aT_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fow(this.m, this.n, this));
      this.l();
      if (this.d.b(this.c.av()) instanceof fof $$0) {
         this.q = $$0;
         this.q.j = this.m.aZ().a();
      }
   }

   protected abstract void l();

   protected void E() {
      this.s.b(fny.a(xj.d, $$0 -> this.aP_()).a(200).a());
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

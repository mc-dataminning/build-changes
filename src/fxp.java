import javax.annotation.Nullable;

public abstract class fxp extends ful {
   protected final ful b;
   protected final fln c;
   @Nullable
   protected fpq d;
   public final fsh s = new fsh(this);

   public fxp(ful $$0, fln $$1, wp $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aR_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         foq var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fpq(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fpa $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fot.a(wo.d, $$0 -> this.aO_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aI_() {
      this.m.n.az();
   }

   @Override
   public void aO_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

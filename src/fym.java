import javax.annotation.Nullable;

public abstract class fym extends fvi {
   protected final fvi b;
   protected final fmk c;
   @Nullable
   protected fqn d;
   public final fte s = new fte(this);

   public fym(fvi $$0, fmk $$1, wp $$2) {
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
         fpo var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fqn(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fpx $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fpq.a(wo.d, $$0 -> this.aO_()).a(200).a());
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

import javax.annotation.Nullable;

public abstract class fva extends frw {
   protected final frw b;
   protected final fki c;
   @Nullable
   protected fna d;
   public final fps s = new fps(this);

   public fva(frw $$0, fki $$1, xj $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aR_() {
      this.J();
      this.G();
      this.F();
      this.s.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   protected void J() {
      this.s.a(this.l, this.p);
   }

   protected void G() {
      this.d = this.s.c(new fna(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.au()) instanceof fmk $$0) {
         this.q = $$0;
         this.q.j = this.m.aZ().a();
      }
   }

   protected abstract void m();

   protected void F() {
      this.s.b(fmd.a(xi.d, $$0 -> this.aO_()).a(200).a());
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
   public void aO_() {
      if (this.d != null) {
         this.d.c();
      }

      this.m.a(this.b);
   }
}

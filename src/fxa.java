import javax.annotation.Nullable;

public abstract class fxa extends ftw {
   protected final ftw b;
   protected final fmi c;
   @Nullable
   protected fpb d;
   public final frs s = new frs(this);

   public fxa(ftw $$0, fmi $$1, xv $$2) {
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
         fob var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fpb(this.m, this.n, this));
      this.l();
      if (this.d.b(this.c.av()) instanceof fok $$0) {
         this.q = $$0;
         this.q.j = this.m.aZ().a();
      }
   }

   protected abstract void l();

   protected void E() {
      this.s.b(fod.a(xu.d, $$0 -> this.aP_()).a(200).a());
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

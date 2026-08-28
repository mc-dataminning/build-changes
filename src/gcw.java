import javax.annotation.Nullable;

public abstract class gcw extends fzq {
   protected final fzq b;
   protected final fqu c;
   @Nullable
   protected fuv d;
   public final fxm s = new fxm(this);

   public gcw(fzq $$0, fqu $$1, xg $$2) {
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
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fuv(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fuf $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fty.a(xf.d, $$0 -> this.aQ_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aK_() {
      this.m.n.az();
   }

   @Override
   public void aQ_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

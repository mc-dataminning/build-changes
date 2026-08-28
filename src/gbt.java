import javax.annotation.Nullable;

public abstract class gbt extends fyn {
   protected final fyn b;
   protected final fps c;
   @Nullable
   protected fts d;
   public final fwj s = new fwj(this);

   public gbt(fyn $$0, fps $$1, wy $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         fst var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fts(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof ftc $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fsv.a(wx.d, $$0 -> this.aL_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aF_() {
      this.m.n.az();
   }

   @Override
   public void aL_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

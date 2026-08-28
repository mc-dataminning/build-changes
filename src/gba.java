import javax.annotation.Nullable;

public abstract class gba extends fxu {
   protected final fxu b;
   protected final fow c;
   @Nullable
   protected fsz d;
   public final fvq s = new fvq(this);

   public gba(fxu $$0, fow $$1, wy $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aN_() {
      this.G();
      this.F();
      this.E();
      this.s.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fsz(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fsj $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fsc.a(wx.d, $$0 -> this.aK_()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void aE_() {
      this.m.n.az();
   }

   @Override
   public void aK_() {
      if (this.d != null) {
         this.d.b();
      }

      this.m.a(this.b);
   }
}

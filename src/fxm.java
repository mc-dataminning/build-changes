import javax.annotation.Nullable;

public abstract class fxm extends fui {
   protected final fui b;
   protected final fll c;
   @Nullable
   protected fpn d;
   public final fse s = new fse(this);

   public fxm(fui $$0, fll $$1, wo $$2) {
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
         fon var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.s.a(this.l, this.p);
   }

   protected void F() {
      this.d = this.s.c(new fpn(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.av()) instanceof fox $$0) {
         this.q = $$0;
         this.q.j = this.m.aY().a();
      }
   }

   protected abstract void m();

   protected void E() {
      this.s.b(fop.a(wn.d, $$0 -> this.aO_()).a(200).a());
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

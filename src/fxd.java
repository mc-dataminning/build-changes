import javax.annotation.Nullable;

public abstract class fxd extends fui {
   private static final int b = 100;
   private final wo c;
   @Nullable
   private final wo d;
   private final wo s;
   @Nullable
   protected fos a;
   @Nullable
   private fpb u;
   private final fsc v;

   protected fxd(wo $$0, wo $$1, wo $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fxd(wo $$0, wo $$1, @Nullable wo $$2, wo $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fsc(0, 0, this.n, this.o);
   }

   protected abstract fsf m();

   @Override
   protected void aR_() {
      fsi $$0 = this.v.a(fsi.d().a(8));
      $$0.c().b();
      $$0.a(new fpx(this.n(), this.p));
      this.u = $$0.a(new fpb(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fsi $$1 = $$0.a(fsi.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fos.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fon var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fsc.a(this.v, this.J());
   }

   @Override
   public wo i() {
      return this.s;
   }
}

import java.net.URI;

public class fzx extends gaf {
   private static final xc a = xc.c("symlink_warning.title.world").a(o.r);
   private static final xc b = xc.a("symlink_warning.message.world", xc.a(ayl.p));
   private static final xc c = xc.c("symlink_warning.title.pack").a(o.r);
   private static final xc d = xc.a("symlink_warning.message.pack", xc.a(ayl.p));
   private final xc s;
   private final URI u;
   private final Runnable v;
   private final fya w = new fya().b(10);

   public fzx(xc $$0, xc $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static gaf a(Runnable $$0) {
      return new fzx(a, b, ayl.p, $$0);
   }

   public static gaf b(Runnable $$0) {
      return new fzx(c, d, ayl.p, $$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.w.c().b();
      fya.b $$0 = this.w.d(1);
      $$0.a(new fvu(this.l, this.p));
      $$0.a(new fvh(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fya $$2 = new fya().a(5);
      fya.b $$3 = $$2.d(3);
      $$3.a(fun.a(xb.n, $$0x -> ag.n().a(this.u)).b(120, 20).a());
      $$3.a(fun.a(xb.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fun.a(xb.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fxz.a(this.w, this.J());
   }

   @Override
   public xc i() {
      return xb.a(super.i(), this.s);
   }

   @Override
   public void aP_() {
      this.v.run();
   }
}

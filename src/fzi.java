import java.net.URI;

public class fzi extends fzq {
   private static final xg a = xg.c("symlink_warning.title.world").a(o.r);
   private static final xg b = xg.a("symlink_warning.message.world", xg.a(ayt.p));
   private static final xg c = xg.c("symlink_warning.title.pack").a(o.r);
   private static final xg d = xg.a("symlink_warning.message.pack", xg.a(ayt.p));
   private final xg s;
   private final URI u;
   private final Runnable v;
   private final fxl w = new fxl().b(10);

   public fzi(xg $$0, xg $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fzq a(Runnable $$0) {
      return new fzi(a, b, ayt.p, $$0);
   }

   public static fzq b(Runnable $$0) {
      return new fzi(c, d, ayt.p, $$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.w.c().b();
      fxl.b $$0 = this.w.d(1);
      $$0.a(new fvf(this.l, this.p));
      $$0.a(new fus(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fxl $$2 = new fxl().a(5);
      fxl.b $$3 = $$2.d(3);
      $$3.a(fty.a(xf.n, $$0x -> ag.n().a(this.u)).b(120, 20).a());
      $$3.a(fty.a(xf.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fty.a(xf.k, $$0x -> this.aQ_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fxk.a(this.w, this.J());
   }

   @Override
   public xg i() {
      return xf.a(super.i(), this.s);
   }

   @Override
   public void aQ_() {
      this.v.run();
   }
}

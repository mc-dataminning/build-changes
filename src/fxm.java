import java.net.URI;

public class fxm extends fxu {
   private static final wy a = wy.c("symlink_warning.title.world").a(n.r);
   private static final wy b = wy.a("symlink_warning.message.world", wy.a(ayh.p));
   private static final wy c = wy.c("symlink_warning.title.pack").a(n.r);
   private static final wy d = wy.a("symlink_warning.message.pack", wy.a(ayh.p));
   private final wy s;
   private final URI u;
   private final Runnable v;
   private final fvp w = new fvp().b(10);

   public fxm(wy $$0, wy $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fxu a(Runnable $$0) {
      return new fxm(a, b, ayh.p, $$0);
   }

   public static fxu b(Runnable $$0) {
      return new fxm(c, d, ayh.p, $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.w.c().b();
      fvp.b $$0 = this.w.d(1);
      $$0.a(new ftj(this.l, this.p));
      $$0.a(new fsw(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fvp $$2 = new fvp().a(5);
      fvp.b $$3 = $$2.d(3);
      $$3.a(fsc.a(wx.n, $$0x -> af.n().a(this.u)).b(120, 20).a());
      $$3.a(fsc.a(wx.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fsc.a(wx.k, $$0x -> this.aK_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fvo.a(this.w, this.J());
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.s);
   }

   @Override
   public void aK_() {
      this.v.run();
   }
}

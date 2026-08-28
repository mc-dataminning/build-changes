import java.net.URI;

public class fvx extends fwf {
   private static final wv a = wv.c("symlink_warning.title.world").a(n.r);
   private static final wv b = wv.a("symlink_warning.message.world", wv.a(ayf.p));
   private static final wv c = wv.c("symlink_warning.title.pack").a(n.r);
   private static final wv d = wv.a("symlink_warning.message.pack", wv.a(ayf.p));
   private final wv s;
   private final URI u;
   private final Runnable v;
   private final fua w = new fua().b(10);

   public fvx(wv $$0, wv $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fwf a(Runnable $$0) {
      return new fvx(a, b, ayf.p, $$0);
   }

   public static fwf b(Runnable $$0) {
      return new fvx(c, d, ayf.p, $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.w.c().b();
      fua.b $$0 = this.w.d(1);
      $$0.a(new fru(this.l, this.p));
      $$0.a(new frh(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fua $$2 = new fua().a(5);
      fua.b $$3 = $$2.d(3);
      $$3.a(fqn.a(wu.n, $$0x -> af.n().a(this.u)).b(120, 20).a());
      $$3.a(fqn.a(wu.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fqn.a(wu.k, $$0x -> this.aK_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      ftz.a(this.w, this.J());
   }

   @Override
   public wv i() {
      return wu.a(super.i(), this.s);
   }

   @Override
   public void aK_() {
      this.v.run();
   }
}

import java.net.URI;

public class fxa extends fxi {
   private static final ww a = ww.c("symlink_warning.title.world").a(n.r);
   private static final ww b = ww.a("symlink_warning.message.world", ww.a(ayf.p));
   private static final ww c = ww.c("symlink_warning.title.pack").a(n.r);
   private static final ww d = ww.a("symlink_warning.message.pack", ww.a(ayf.p));
   private final ww s;
   private final URI u;
   private final Runnable v;
   private final fvd w = new fvd().b(10);

   public fxa(ww $$0, ww $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fxi a(Runnable $$0) {
      return new fxa(a, b, ayf.p, $$0);
   }

   public static fxi b(Runnable $$0) {
      return new fxa(c, d, ayf.p, $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.w.c().b();
      fvd.b $$0 = this.w.d(1);
      $$0.a(new fsx(this.l, this.p));
      $$0.a(new fsk(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fvd $$2 = new fvd().a(5);
      fvd.b $$3 = $$2.d(3);
      $$3.a(frq.a(wv.n, $$0x -> af.n().a(this.u)).b(120, 20).a());
      $$3.a(frq.a(wv.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(frq.a(wv.k, $$0x -> this.aK_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fvc.a(this.w, this.J());
   }

   @Override
   public ww i() {
      return wv.a(super.i(), this.s);
   }

   @Override
   public void aK_() {
      this.v.run();
   }
}

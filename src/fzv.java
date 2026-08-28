import java.net.URI;

public class fzv extends gad {
   private static final xa a = xa.c("symlink_warning.title.world").a(o.r);
   private static final xa b = xa.a("symlink_warning.message.world", xa.a(ayj.p));
   private static final xa c = xa.c("symlink_warning.title.pack").a(o.r);
   private static final xa d = xa.a("symlink_warning.message.pack", xa.a(ayj.p));
   private final xa s;
   private final URI u;
   private final Runnable v;
   private final fxy w = new fxy().b(10);

   public fzv(xa $$0, xa $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static gad a(Runnable $$0) {
      return new fzv(a, b, ayj.p, $$0);
   }

   public static gad b(Runnable $$0) {
      return new fzv(c, d, ayj.p, $$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.w.c().b();
      fxy.b $$0 = this.w.d(1);
      $$0.a(new fvs(this.l, this.p));
      $$0.a(new fvf(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fxy $$2 = new fxy().a(5);
      fxy.b $$3 = $$2.d(3);
      $$3.a(ful.a(wz.n, $$0x -> ag.n().a(this.u)).b(120, 20).a());
      $$3.a(ful.a(wz.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(ful.a(wz.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fxx.a(this.w, this.J());
   }

   @Override
   public xa i() {
      return wz.a(super.i(), this.s);
   }

   @Override
   public void aP_() {
      this.v.run();
   }
}

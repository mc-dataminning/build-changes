import javax.annotation.Nullable;

public class gbc extends fwf {
   private static final wv a = wv.c("telemetry_info.screen.title");
   private static final wv b = wv.c("telemetry_info.screen.description").b(-4539718);
   private static final wv c = wv.c("telemetry_info.button.privacy_statement");
   private static final wv d = wv.c("telemetry_info.button.give_feedback");
   private static final wv s = wv.c("telemetry_info.button.show_data");
   private static final wv u = wv.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fnd.Q().D();
   private final fwf x;
   private final fnh y;
   private final fub z = new fub(this, 16 + 9 * 5 + 20, w ? 33 + fqp.a(fnd.Q().h) : 33);
   @Nullable
   private gbb A;
   @Nullable
   private frh B;
   private double C;

   public gbc(fwf $$0, fnh $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wv i() {
      return wu.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fuf $$0 = this.z.a(fuf.d().a(4));
      $$0.c().b();
      $$0.a(new fru(a, this.p));
      this.B = $$0.a(new frh(b, this.p).b(true));
      fuf $$1 = $$0.a(fuf.e().a(8));
      $$1.a(fqn.a(c, this::a).a());
      $$1.a(fqn.a(d, this::b).a());
      fuf $$2 = this.z.b(fuf.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fuf $$3 = $$2.a(fuf.e().a(8));
      $$3.a(fqn.a(s, this::c).a());
      $$3.a(fqn.a(wu.d, $$0x -> this.aK_()).a());
      fuf $$4 = this.z.c(fuf.d().a(8));
      this.A = $$4.a(new gbb(0, 0, this.n - 40, this.z.d(), this.p));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.h(this.n - 40);
         this.A.i(this.z.d());
         this.A.q();
      }

      if (this.B != null) {
         this.B.d(this.n - 16);
      }

      this.z.a();
   }

   @Override
   protected void aB_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fql m() {
      fng<Boolean> $$0 = this.y.al();
      return fqp.a(u, this.p).a($$0).a(this::a).a();
   }

   private void a(fql $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fqn $$0) {
      fvc.a(this, ayf.c);
   }

   private void b(fqn $$0) {
      fvc.a(this, ayf.i);
   }

   private void c(fqn $$0) {
      af.n().a(this.m.u().b());
   }

   @Override
   public void aK_() {
      this.m.a(this.x);
   }
}

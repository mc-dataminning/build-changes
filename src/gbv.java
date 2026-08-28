import java.util.List;
import javax.annotation.Nullable;

public class gbv extends fzq {
   private static final List<edb> a = List.of(edb.values());
   private static final xg b = xg.c(dnq.pI.v());
   private static final xg c = xg.c("test_block.message");
   private final iw d;
   private edb s;
   private String u;
   @Nullable
   private fuh v;

   public gbv(eai $$0) {
      super(b);
      this.d = $$0.aC_();
      this.s = $$0.d();
      this.u = $$0.t();
   }

   @Override
   public void aT_() {
      this.v = new fuh(this.p, this.n / 2 - 152, 80, 240, 20, xg.c("test_block.message"));
      this.v.f(128);
      this.v.a(this.u);
      this.c(this.v);
      this.b(this.v);
      this.a(this.s);
      this.c(fuf.<edb>a(edb::a).a(a).a().a(this.s).a(this.n / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(fty.a(xf.d, $$0 -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c(fty.a(xf.e, $$0 -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if (this.s != edb.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 70, 10526880);
      }

      $$0.b(this.p, this.s.b(), this.n / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }

   private void m() {
      this.u = this.v.a();
      this.m.L().b(new aix(this.d, this.s, this.u));
      this.aQ_();
   }

   @Override
   public void aQ_() {
      this.E();
   }

   private void E() {
      this.m.a(null);
   }

   private void a(edb $$0) {
      this.s = $$0;
      this.v.k = $$0 != edb.a;
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

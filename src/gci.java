import java.util.List;
import javax.annotation.Nullable;

public class gci extends gad {
   private static final List<ecp> a = List.of(ecp.values());
   private static final xa b = xa.c(dne.pI.v());
   private static final xa c = xa.c("test_block.message");
   private final iv d;
   private ecp s;
   private String u;
   @Nullable
   private fuu v;

   public gci(dzw $$0) {
      super(b);
      this.d = $$0.aB_();
      this.s = $$0.d();
      this.u = $$0.t();
   }

   @Override
   public void aS_() {
      this.v = new fuu(this.p, this.n / 2 - 152, 80, 240, 20, xa.c("test_block.message"));
      this.v.f(128);
      this.v.a(this.u);
      this.c(this.v);
      this.b(this.v);
      this.a(this.s);
      this.c(fus.<ecp>a(ecp::a).a(a).a().a(this.s).a(this.n / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(ful.a(wz.d, $$0 -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c(ful.a(wz.e, $$0 -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if (this.s != ecp.a) {
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
      this.m.L().b(new aio(this.d, this.s, this.u));
      this.aP_();
   }

   @Override
   public void aP_() {
      this.E();
   }

   private void E() {
      this.m.a(null);
   }

   private void a(ecp $$0) {
      this.s = $$0;
      this.v.k = $$0 != ecp.a;
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

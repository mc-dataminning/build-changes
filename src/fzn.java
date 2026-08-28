import java.util.List;
import javax.annotation.Nullable;

public class fzn extends fxi {
   private static final List<eaz> a = List.of(eaz.values());
   private static final ww b = ww.c(dlw.pE.v());
   private static final ww c = ww.c("test_block.message");
   private final iu d;
   private eaz s;
   private String u;
   @Nullable
   private frz v;

   public fzn(dyh $$0) {
      super(b);
      this.d = $$0.aw_();
      this.s = $$0.d();
      this.u = $$0.t();
   }

   @Override
   public void aN_() {
      this.v = new frz(this.p, this.n / 2 - 152, 80, 240, 20, ww.c("test_block.message"));
      this.v.f(128);
      this.v.a(this.u);
      this.c(this.v);
      this.b(this.v);
      this.a(this.s);
      this.c(frx.<eaz>a(eaz::a).a(a).a().a(this.s).a(this.n / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(frq.a(wv.d, $$0 -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c(frq.a(wv.e, $$0 -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if (this.s != eaz.a) {
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
      this.m.L().b(new aik(this.d, this.s, this.u));
      this.aK_();
   }

   @Override
   public void aK_() {
      this.E();
   }

   private void E() {
      this.m.a(null);
   }

   private void a(eaz $$0) {
      this.s = $$0;
      this.v.k = $$0 != eaz.a;
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

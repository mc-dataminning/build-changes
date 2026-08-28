import java.util.List;
import javax.annotation.Nullable;

public class fzz extends fxu {
   private static final List<ebk> a = List.of(ebk.values());
   private static final wy b = wy.c(dmc.pF.v());
   private static final wy c = wy.c("test_block.message");
   private final iu d;
   private ebk s;
   private String u;
   @Nullable
   private fsl v;

   public fzz(dyr $$0) {
      super(b);
      this.d = $$0.aw_();
      this.s = $$0.d();
      this.u = $$0.t();
   }

   @Override
   public void aN_() {
      this.v = new fsl(this.p, this.n / 2 - 152, 80, 240, 20, wy.c("test_block.message"));
      this.v.f(128);
      this.v.a(this.u);
      this.c(this.v);
      this.b(this.v);
      this.a(this.s);
      this.c(fsj.<ebk>a(ebk::a).a(a).a().a(this.s).a(this.n / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(fsc.a(wx.d, $$0 -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c(fsc.a(wx.e, $$0 -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if (this.s != ebk.a) {
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
      this.m.L().b(new aim(this.d, this.s, this.u));
      this.aK_();
   }

   @Override
   public void aK_() {
      this.E();
   }

   private void E() {
      this.m.a(null);
   }

   private void a(ebk $$0) {
      this.s = $$0;
      this.v.k = $$0 != ebk.a;
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

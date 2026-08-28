import java.util.List;
import javax.annotation.Nullable;

public class gas extends fyn {
   private static final List<ebz> a = List.of(ebz.values());
   private static final wy b = wy.c(dmo.pI.v());
   private static final wy c = wy.c("test_block.message");
   private final iv d;
   private ebz s;
   private String u;
   @Nullable
   private fte v;

   public gas(dzg $$0) {
      super(b);
      this.d = $$0.ax_();
      this.s = $$0.d();
      this.u = $$0.t();
   }

   @Override
   public void aO_() {
      this.v = new fte(this.p, this.n / 2 - 152, 80, 240, 20, wy.c("test_block.message"));
      this.v.f(128);
      this.v.a(this.u);
      this.c(this.v);
      this.b(this.v);
      this.a(this.s);
      this.c(ftc.<ebz>a(ebz::a).a(a).a().a(this.s).a(this.n / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(fsv.a(wx.d, $$0 -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c(fsv.a(wx.e, $$0 -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if (this.s != ebz.a) {
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
      this.aL_();
   }

   @Override
   public void aL_() {
      this.E();
   }

   private void E() {
      this.m.a(null);
   }

   private void a(ebz $$0) {
      this.s = $$0;
      this.v.k = $$0 != ebz.a;
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}

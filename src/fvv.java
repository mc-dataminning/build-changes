import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fvv extends fvu<gdz.a> {
   private static final xl C = xl.c("gui.chatReport.title");
   private static final xl D = xl.c("gui.chatReport.select_chat");
   private fmo E;
   private flw F;
   private flw G;

   private fvv(frp $$0, geg $$1, gdz.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fvv(frp $$0, geg $$1, UUID $$2) {
      this($$0, $$1, new gdz.a($$2, $$1.a().b()));
   }

   public fvv(frp $$0, geg $$1, gdz $$2) {
      this($$0, $$1, new gdz.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      this.F = this.z.a(flw.a(D, $$0 -> this.m.a(new fvx(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.F();
         }))).a(280).a());
      this.G = flw.a(c, $$0 -> this.m.a(new fwa(this, this.A.i(), gef.a, $$0x -> {
            this.A.a($$0x);
            this.F();
         }))).a(280).a();
      this.z.a(fph.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.F();
      });
      this.z.a(fph.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void F() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xl.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gee $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.F();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}

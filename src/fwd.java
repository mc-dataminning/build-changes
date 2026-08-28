import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fwd extends fwc<gei.a> {
   private static final xj C = xj.c("gui.chatReport.title");
   private static final xj D = xj.c("gui.chatReport.select_chat");
   private fmv E;
   private fmd F;
   private fmd G;

   private fwd(frw $$0, gep $$1, gei.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fwd(frw $$0, gep $$1, UUID $$2) {
      this($$0, $$1, new gei.a($$2, $$1.a().b()));
   }

   public fwd(frw $$0, gep $$1, gei $$2) {
      this($$0, $$1, new gei.a($$2, $$1.a().b()));
   }

   @Override
   protected void F() {
      this.F = this.z.a(fmd.a(D, $$0 -> this.m.a(new fwf(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.J();
         }))).a(280).a());
      this.G = fmd.a(c, $$0 -> this.m.a(new fwi(this, this.A.i(), geo.a, $$0x -> {
            this.A.a($$0x);
            this.J();
         }))).a(280).a();
      this.z.a(fpo.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.J();
      });
      this.z.a(fpo.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void J() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xj.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gen $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.J();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}

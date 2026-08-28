import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fuy extends fux<gcy.a> {
   private static final xh C = xh.c("gui.chatReport.title");
   private static final xh D = xh.c("gui.chatReport.select_chat");
   private flr E;
   private fkz F;
   private fkz G;

   private fuy(fqs $$0, gdf $$1, gcy.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fuy(fqs $$0, gdf $$1, UUID $$2) {
      this($$0, $$1, new gcy.a($$2, $$1.a().b()));
   }

   public fuy(fqs $$0, gdf $$1, gcy $$2) {
      this($$0, $$1, new gcy.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      this.F = this.z.a(fkz.a(D, $$0 -> this.m.a(new fva(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.F();
         }))).a(280).a());
      this.G = fkz.a(c, $$0 -> this.m.a(new fvd(this, this.A.i(), gde.a, $$0x -> {
            this.A.a($$0x);
            this.F();
         }))).a(280).a();
      this.z.a(foj.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.F();
      });
      this.z.a(foj.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void F() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xh.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gdd $$1 = this.A.i();
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

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fvg extends fvf<gdj.a> {
   private static final xi C = xi.c("gui.chatReport.title");
   private static final xi D = xi.c("gui.chatReport.select_chat");
   private flz E;
   private flh F;
   private flh G;

   private fvg(fra $$0, gdq $$1, gdj.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fvg(fra $$0, gdq $$1, UUID $$2) {
      this($$0, $$1, new gdj.a($$2, $$1.a().b()));
   }

   public fvg(fra $$0, gdq $$1, gdj $$2) {
      this($$0, $$1, new gdj.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      this.F = this.z.a(flh.a(D, $$0 -> this.m.a(new fvi(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.F();
         }))).a(280).a());
      this.G = flh.a(c, $$0 -> this.m.a(new fvl(this, this.A.i(), gdp.a, $$0x -> {
            this.A.a($$0x);
            this.F();
         }))).a(280).a();
      this.z.a(fos.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.F();
      });
      this.z.a(fos.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void F() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xi.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gdo $$1 = this.A.i();
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

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gcd extends gcc<gkt.a> {
   private static final wy C = wy.c("gui.chatReport.title");
   private static final wy D = wy.c("gui.chatReport.select_chat");
   private fsu E;
   private fsc F;
   private fsc G;

   private gcd(fxu $$0, gla $$1, gkt.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gcd(fxu $$0, gla $$1, UUID $$2) {
      this($$0, $$1, new gkt.a($$2, $$1.a().b()));
   }

   public gcd(fxu $$0, gla $$1, gkt $$2) {
      this($$0, $$1, new gkt.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fsc.a(D, $$0 -> this.m.a(new gcf(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fsc.a(c, $$0 -> this.m.a(new gci(this, this.A.i(), gkz.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fvm.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fvm.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wy.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gky $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.G();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}

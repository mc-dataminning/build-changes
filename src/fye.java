import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fye extends fyd<ggl.a> {
   private static final xv C = xv.c("gui.chatReport.title");
   private static final xv D = xv.c("gui.chatReport.select_chat");
   private fox E;
   private foe F;
   private foe G;

   private fye(ftx $$0, ggs $$1, ggl.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fye(ftx $$0, ggs $$1, UUID $$2) {
      this($$0, $$1, new ggl.a($$2, $$1.a().b()));
   }

   public fye(ftx $$0, ggs $$1, ggl $$2) {
      this($$0, $$1, new ggl.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(foe.a(D, $$0 -> this.m.a(new fyg(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = foe.a(c, $$0 -> this.m.a(new fyj(this, this.A.i(), ggr.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(frp.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(frp.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xv.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ggq $$1 = this.A.i();
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

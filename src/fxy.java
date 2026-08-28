import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fxy extends fxx<ggf.a> {
   private static final xv C = xv.c("gui.chatReport.title");
   private static final xv D = xv.c("gui.chatReport.select_chat");
   private foq E;
   private fny F;
   private fny G;

   private fxy(ftr $$0, ggm $$1, ggf.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fxy(ftr $$0, ggm $$1, UUID $$2) {
      this($$0, $$1, new ggf.a($$2, $$1.a().b()));
   }

   public fxy(ftr $$0, ggm $$1, ggf $$2) {
      this($$0, $$1, new ggf.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fny.a(D, $$0 -> this.m.a(new fya(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fny.a(c, $$0 -> this.m.a(new fyd(this, this.A.i(), ggl.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(frj.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(frj.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xv.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ggk $$1 = this.A.i();
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

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fyd extends fyc<ggk.a> {
   private static final xv C = xv.c("gui.chatReport.title");
   private static final xv D = xv.c("gui.chatReport.select_chat");
   private fow E;
   private fod F;
   private fod G;

   private fyd(ftw $$0, ggr $$1, ggk.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyd(ftw $$0, ggr $$1, UUID $$2) {
      this($$0, $$1, new ggk.a($$2, $$1.a().b()));
   }

   public fyd(ftw $$0, ggr $$1, ggk $$2) {
      this($$0, $$1, new ggk.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fod.a(D, $$0 -> this.m.a(new fyf(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fod.a(c, $$0 -> this.m.a(new fyi(this, this.A.i(), ggq.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fro.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fro.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xv.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ggp $$1 = this.A.i();
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

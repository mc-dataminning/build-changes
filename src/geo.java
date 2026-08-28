import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class geo extends gen<gnf.a> {
   private static final xc C = xc.c("gui.chatReport.title");
   private static final xc D = xc.c("gui.chatReport.select_chat");
   private fvf E;
   private fun F;
   private fun G;

   private geo(gaf $$0, gnm $$1, gnf.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public geo(gaf $$0, gnm $$1, UUID $$2) {
      this($$0, $$1, new gnf.a($$2, $$1.a().b()));
   }

   public geo(gaf $$0, gnm $$1, gnf $$2) {
      this($$0, $$1, new gnf.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fun.a(D, $$0 -> this.m.a(new geq(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fun.a(c, $$0 -> this.m.a(new get(this, this.A.i(), gnl.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fxx.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fxx.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xc.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gnk $$1 = this.A.i();
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

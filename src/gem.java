import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gem extends gel<gnd.a> {
   private static final xa C = xa.c("gui.chatReport.title");
   private static final xa D = xa.c("gui.chatReport.select_chat");
   private fvd E;
   private ful F;
   private ful G;

   private gem(gad $$0, gnk $$1, gnd.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gem(gad $$0, gnk $$1, UUID $$2) {
      this($$0, $$1, new gnd.a($$2, $$1.a().b()));
   }

   public gem(gad $$0, gnk $$1, gnd $$2) {
      this($$0, $$1, new gnd.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(ful.a(D, $$0 -> this.m.a(new geo(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = ful.a(c, $$0 -> this.m.a(new ger(this, this.A.i(), gnj.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fxv.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fxv.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xa.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gni $$1 = this.A.i();
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

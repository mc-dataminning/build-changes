import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fyp extends fyo<ggy.a> {
   private static final wo C = wo.c("gui.chatReport.title");
   private static final wo D = wo.c("gui.chatReport.select_chat");
   private fpi E;
   private fop F;
   private fop G;

   private fyp(fui $$0, ghf $$1, ggy.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyp(fui $$0, ghf $$1, UUID $$2) {
      this($$0, $$1, new ggy.a($$2, $$1.a().b()));
   }

   public fyp(fui $$0, ghf $$1, ggy $$2) {
      this($$0, $$1, new ggy.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fop.a(D, $$0 -> this.m.a(new fyr(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fop.a(c, $$0 -> this.m.a(new fyu(this, this.A.i(), ghe.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fsa.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fsa.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wo.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ghd $$1 = this.A.i();
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

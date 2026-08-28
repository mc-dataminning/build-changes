import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fzp extends fzo<gia.a> {
   private static final wp C = wp.c("gui.chatReport.title");
   private static final wp D = wp.c("gui.chatReport.select_chat");
   private fqi E;
   private fpq F;
   private fpq G;

   private fzp(fvi $$0, gih $$1, gia.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fzp(fvi $$0, gih $$1, UUID $$2) {
      this($$0, $$1, new gia.a($$2, $$1.a().b()));
   }

   public fzp(fvi $$0, gih $$1, gia $$2) {
      this($$0, $$1, new gia.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fpq.a(D, $$0 -> this.m.a(new fzr(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fpq.a(c, $$0 -> this.m.a(new fzu(this, this.A.i(), gig.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fta.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fta.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wp.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gif $$1 = this.A.i();
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

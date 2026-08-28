import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fyr extends fyq<gha.a> {
   private static final wp C = wp.c("gui.chatReport.title");
   private static final wp D = wp.c("gui.chatReport.select_chat");
   private fpk E;
   private fos F;
   private fos G;

   private fyr(fuk $$0, ghh $$1, gha.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyr(fuk $$0, ghh $$1, UUID $$2) {
      this($$0, $$1, new gha.a($$2, $$1.a().b()));
   }

   public fyr(fuk $$0, ghh $$1, gha $$2) {
      this($$0, $$1, new gha.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fos.a(D, $$0 -> this.m.a(new fyt(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fos.a(c, $$0 -> this.m.a(new fyw(this, this.A.i(), ghg.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fsc.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fsc.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wp.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ghf $$1 = this.A.i();
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

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gdb extends gda<gls.a> {
   private static final wy C = wy.c("gui.chatReport.title");
   private static final wy D = wy.c("gui.chatReport.select_chat");
   private fts E;
   private fta F;
   private fta G;

   private gdb(fys $$0, glz $$1, gls.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gdb(fys $$0, glz $$1, UUID $$2) {
      this($$0, $$1, new gls.a($$2, $$1.a().b()));
   }

   public gdb(fys $$0, glz $$1, gls $$2) {
      this($$0, $$1, new gls.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fta.a(D, $$0 -> this.m.a(new gdd(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fta.a(c, $$0 -> this.m.a(new gdg(this, this.A.i(), gly.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fwk.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fwk.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wy.a("gui.chatReport.selected_chat", $$0.size()));
      }

      glx $$1 = this.A.i();
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

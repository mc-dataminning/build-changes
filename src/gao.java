import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gao extends gan<gjb.a> {
   private static final wv C = wv.c("gui.chatReport.title");
   private static final wv D = wv.c("gui.chatReport.select_chat");
   private frf E;
   private fqn F;
   private fqn G;

   private gao(fwf $$0, gji $$1, gjb.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gao(fwf $$0, gji $$1, UUID $$2) {
      this($$0, $$1, new gjb.a($$2, $$1.a().b()));
   }

   public gao(fwf $$0, gji $$1, gjb $$2) {
      this($$0, $$1, new gjb.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fqn.a(D, $$0 -> this.m.a(new gaq(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fqn.a(c, $$0 -> this.m.a(new gat(this, this.A.i(), gjh.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(ftx.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(ftx.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wv.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gjg $$1 = this.A.i();
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

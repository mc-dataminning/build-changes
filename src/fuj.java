import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fuj extends fui<gci.a> {
   private static final xd C = xd.c("gui.chatReport.title");
   private static final xd D = xd.c("gui.chatReport.select_chat");
   private flc E;
   private fkk F;
   private fkk G;

   private fuj(fqd $$0, gcp $$1, gci.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fuj(fqd $$0, gcp $$1, UUID $$2) {
      this($$0, $$1, new gci.a($$2, $$1.a().b()));
   }

   public fuj(fqd $$0, gcp $$1, gci $$2) {
      this($$0, $$1, new gci.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      this.F = this.z.a(fkk.a(D, $$0 -> this.m.a(new ful(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.F();
         }))).a(280).a());
      this.G = fkk.a(c, $$0 -> this.m.a(new fuo(this, this.A.i(), gco.a, $$0x -> {
            this.A.a($$0x);
            this.F();
         }))).a(280).a();
      this.z.a(fnu.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.F();
      });
      this.z.a(fnu.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void F() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xd.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gcn $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.F();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gbr extends gbq<gkf.a> {
   private static final ww C = ww.c("gui.chatReport.title");
   private static final ww D = ww.c("gui.chatReport.select_chat");
   private fsi E;
   private frq F;
   private frq G;

   private gbr(fxi $$0, gkm $$1, gkf.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gbr(fxi $$0, gkm $$1, UUID $$2) {
      this($$0, $$1, new gkf.a($$2, $$1.a().b()));
   }

   public gbr(fxi $$0, gkm $$1, gkf $$2) {
      this($$0, $$1, new gkf.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(frq.a(D, $$0 -> this.m.a(new gbt(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = frq.a(c, $$0 -> this.m.a(new gbw(this, this.A.i(), gkl.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fva.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fva.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(ww.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gkk $$1 = this.A.i();
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

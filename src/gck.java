import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gck extends gcj<glb.a> {
   private static final wy C = wy.c("gui.chatReport.title");
   private static final wy D = wy.c("gui.chatReport.select_chat");
   private ftb E;
   private fsj F;
   private fsj G;

   private gck(fyb $$0, gli $$1, glb.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gck(fyb $$0, gli $$1, UUID $$2) {
      this($$0, $$1, new glb.a($$2, $$1.a().b()));
   }

   public gck(fyb $$0, gli $$1, glb $$2) {
      this($$0, $$1, new glb.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      this.F = this.z.a(fsj.a(D, $$0 -> this.m.a(new gcm(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.G();
         }))).a(280).a());
      this.G = fsj.a(c, $$0 -> this.m.a(new gcp(this, this.A.i(), glh.a, $$0x -> {
            this.A.a($$0x);
            this.G();
         }))).a(280).a();
      this.z.a(fvt.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.G();
      });
      this.z.a(fvt.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void G() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wy.a("gui.chatReport.selected_chat", $$0.size()));
      }

      glg $$1 = this.A.i();
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

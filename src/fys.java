import java.util.UUID;
import javax.annotation.Nullable;

public class fys extends fyo<gha.a> {
   private static final wo C = wo.c("gui.abuseReport.name.title");
   private static final wo D = wo.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fpi E;

   private fys(fui $$0, ghf $$1, gha.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fys(fui $$0, ghf $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gha.a($$2, $$3, $$1.a().b()));
   }

   public fys(fui $$0, ghf $$1, gha $$2) {
      this($$0, $$1, new gha.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      wo $$0 = wo.b(this.A.e().a()).a(n.o);
      this.z.a(new fpx(wo.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fsa.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (super.b($$0, $$1, $$2)) {
         return true;
      } else {
         return this.E != null ? this.E.b($$0, $$1, $$2) : false;
      }
   }
}

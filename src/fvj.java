import java.util.UUID;
import javax.annotation.Nullable;

public class fvj extends fvf<gdl.a> {
   private static final xi C = xi.c("gui.abuseReport.name.title");
   private static final xi D = xi.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private flz E;

   private fvj(fra $$0, gdq $$1, gdl.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fvj(fra $$0, gdq $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gdl.a($$2, $$3, $$1.a().b()));
   }

   public fvj(fra $$0, gdq $$1, gdl $$2) {
      this($$0, $$1, new gdl.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      xi $$0 = xi.b(this.A.e().a()).a(n.o);
      this.z.a(new fmo(xi.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      this.z.a(fos.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

import java.util.UUID;
import javax.annotation.Nullable;

public class fwg extends fwc<gek.a> {
   private static final xj C = xj.c("gui.abuseReport.name.title");
   private static final xj D = xj.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fmv E;

   private fwg(frw $$0, gep $$1, gek.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fwg(frw $$0, gep $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gek.a($$2, $$3, $$1.a().b()));
   }

   public fwg(frw $$0, gep $$1, gek $$2) {
      this($$0, $$1, new gek.a($$2, $$1.a().b()));
   }

   @Override
   protected void F() {
      xj $$0 = xj.b(this.A.e().a()).a(n.o);
      this.z.a(new fnk(xj.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.J();
      });
      this.z.a(fpo.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

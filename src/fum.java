import java.util.UUID;
import javax.annotation.Nullable;

public class fum extends fui<gck.a> {
   private static final xd C = xd.c("gui.abuseReport.name.title");
   private static final xd D = xd.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private flc E;

   private fum(fqd $$0, gcp $$1, gck.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fum(fqd $$0, gcp $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gck.a($$2, $$3, $$1.a().b()));
   }

   public fum(fqd $$0, gcp $$1, gck $$2) {
      this($$0, $$1, new gck.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      xd $$0 = xd.b(this.A.e().a()).a(n.o);
      this.z.a(new flr(xd.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      this.z.a(fnu.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

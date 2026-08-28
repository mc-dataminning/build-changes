import java.util.UUID;
import javax.annotation.Nullable;

public class fuq extends fum<gcp.a> {
   private static final xe C = xe.c("gui.abuseReport.name.title");
   private static final xe D = xe.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private flg E;

   private fuq(fqh $$0, gcu $$1, gcp.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fuq(fqh $$0, gcu $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gcp.a($$2, $$3, $$1.a().b()));
   }

   public fuq(fqh $$0, gcu $$1, gcp $$2) {
      this($$0, $$1, new gcp.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      xe $$0 = xe.b(this.A.e().a()).a(n.o);
      this.z.a(new flv(xe.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      this.z.a(fny.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

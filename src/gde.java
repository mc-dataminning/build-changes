import java.util.UUID;
import javax.annotation.Nullable;

public class gde extends gda<glu.a> {
   private static final wy C = wy.c("gui.abuseReport.name.title");
   private static final wy D = wy.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fts E;

   private gde(fys $$0, glz $$1, glu.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gde(fys $$0, glz $$1, UUID $$2, String $$3) {
      this($$0, $$1, new glu.a($$2, $$3, $$1.a().b()));
   }

   public gde(fys $$0, glz $$1, glu $$2) {
      this($$0, $$1, new glu.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      wy $$0 = wy.b(this.A.e().a()).a(o.o);
      this.z.a(new fuh(wy.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fwk.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

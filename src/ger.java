import java.util.UUID;
import javax.annotation.Nullable;

public class ger extends gen<gnh.a> {
   private static final xc C = xc.c("gui.abuseReport.name.title");
   private static final xc D = xc.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fvf E;

   private ger(gaf $$0, gnm $$1, gnh.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public ger(gaf $$0, gnm $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gnh.a($$2, $$3, $$1.a().b()));
   }

   public ger(gaf $$0, gnm $$1, gnh $$2) {
      this($$0, $$1, new gnh.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      xc $$0 = xc.b(this.A.e().a()).a(o.o);
      this.z.a(new fvu(xc.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fxx.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

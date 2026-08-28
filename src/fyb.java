import java.util.UUID;
import javax.annotation.Nullable;

public class fyb extends fxx<ggh.a> {
   private static final xv C = xv.c("gui.abuseReport.name.title");
   private static final xv D = xv.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private foq E;

   private fyb(ftr $$0, ggm $$1, ggh.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyb(ftr $$0, ggm $$1, UUID $$2, String $$3) {
      this($$0, $$1, new ggh.a($$2, $$3, $$1.a().b()));
   }

   public fyb(ftr $$0, ggm $$1, ggh $$2) {
      this($$0, $$1, new ggh.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      xv $$0 = xv.b(this.A.e().a()).a(n.o);
      this.z.a(new fpg(xv.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(frj.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

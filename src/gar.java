import java.util.UUID;
import javax.annotation.Nullable;

public class gar extends gan<gjd.a> {
   private static final wv C = wv.c("gui.abuseReport.name.title");
   private static final wv D = wv.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private frf E;

   private gar(fwf $$0, gji $$1, gjd.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gar(fwf $$0, gji $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gjd.a($$2, $$3, $$1.a().b()));
   }

   public gar(fwf $$0, gji $$1, gjd $$2) {
      this($$0, $$1, new gjd.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      wv $$0 = wv.b(this.A.e().a()).a(n.o);
      this.z.a(new fru(wv.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(ftx.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

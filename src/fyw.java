import java.util.UUID;
import javax.annotation.Nullable;

public class fyw extends fys<ghe.a> {
   private static final wp C = wp.c("gui.abuseReport.name.title");
   private static final wp D = wp.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fpm E;

   private fyw(fum $$0, ghj $$1, ghe.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyw(fum $$0, ghj $$1, UUID $$2, String $$3) {
      this($$0, $$1, new ghe.a($$2, $$3, $$1.a().b()));
   }

   public fyw(fum $$0, ghj $$1, ghe $$2) {
      this($$0, $$1, new ghe.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      wp $$0 = wp.b(this.A.e().a()).a(n.o);
      this.z.a(new fqb(wp.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fse.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

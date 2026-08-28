import java.util.UUID;
import javax.annotation.Nullable;

public class gcg extends gcc<gkv.a> {
   private static final wy C = wy.c("gui.abuseReport.name.title");
   private static final wy D = wy.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fsu E;

   private gcg(fxu $$0, gla $$1, gkv.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gcg(fxu $$0, gla $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gkv.a($$2, $$3, $$1.a().b()));
   }

   public gcg(fxu $$0, gla $$1, gkv $$2) {
      this($$0, $$1, new gkv.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      wy $$0 = wy.b(this.A.e().a()).a(n.o);
      this.z.a(new ftj(wy.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fvm.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

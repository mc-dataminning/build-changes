import java.util.UUID;
import javax.annotation.Nullable;

public class gec extends gdy<gms.a> {
   private static final xg C = xg.c("gui.abuseReport.name.title");
   private static final xg D = xg.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fuq E;

   private gec(fzq $$0, gmx $$1, gms.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gec(fzq $$0, gmx $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gms.a($$2, $$3, $$1.a().b()));
   }

   public gec(fzq $$0, gmx $$1, gms $$2) {
      this($$0, $$1, new gms.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      xg $$0 = xg.b(this.A.e().a()).a(o.o);
      this.z.a(new fvf(xg.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fxi.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

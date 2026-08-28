import java.util.UUID;
import javax.annotation.Nullable;

public class gep extends gel<gnf.a> {
   private static final xa C = xa.c("gui.abuseReport.name.title");
   private static final xa D = xa.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fvd E;

   private gep(gad $$0, gnk $$1, gnf.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public gep(gad $$0, gnk $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gnf.a($$2, $$3, $$1.a().b()));
   }

   public gep(gad $$0, gnk $$1, gnf $$2) {
      this($$0, $$1, new gnf.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      xa $$0 = xa.b(this.A.e().a()).a(o.o);
      this.z.a(new fvs(xa.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fxv.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

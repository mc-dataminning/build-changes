import java.util.UUID;
import javax.annotation.Nullable;

public class fyg extends fyc<ggm.a> {
   private static final xv C = xv.c("gui.abuseReport.name.title");
   private static final xv D = xv.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fow E;

   private fyg(ftw $$0, ggr $$1, ggm.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fyg(ftw $$0, ggr $$1, UUID $$2, String $$3) {
      this($$0, $$1, new ggm.a($$2, $$3, $$1.a().b()));
   }

   public fyg(ftw $$0, ggr $$1, ggm $$2) {
      this($$0, $$1, new ggm.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      xv $$0 = xv.b(this.A.e().a()).a(n.o);
      this.z.a(new fpl(xv.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.b().a(0, 8));
      this.E = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      this.z.a(fro.a(this.p, this.E, D, $$0x -> $$0x.e(12)));
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

import java.util.ArrayList;
import java.util.List;

public class fvb extends fva {
   private static final xj a = xj.c("options.skinCustomisation.title");

   public fvb(frw $$0, fki $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fmb> $$0 = new ArrayList<>();

      for (cov $$1 : cov.values()) {
         $$0.add(fmk.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}

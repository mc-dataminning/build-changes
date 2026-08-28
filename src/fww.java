import java.util.ArrayList;
import java.util.List;

public class fww extends fwv {
   private static final xk a = xk.c("options.skinCustomisation.title");

   public fww(ftr $$0, fmd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      List<fnw> $$0 = new ArrayList<>();

      for (cpp $$1 : cpp.values()) {
         $$0.add(fof.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

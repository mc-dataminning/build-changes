import java.util.ArrayList;
import java.util.List;

public class fxd extends fxc {
   private static final xv a = xv.c("options.skinCustomisation.title");

   public fxd(fty $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      List<fod> $$0 = new ArrayList<>();

      for (cpy $$1 : cpy.values()) {
         $$0.add(fom.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

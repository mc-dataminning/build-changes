import java.util.ArrayList;
import java.util.List;

public class fxc extends fxb {
   private static final xv a = xv.c("options.skinCustomisation.title");

   public fxc(ftx $$0, fmj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      List<foc> $$0 = new ArrayList<>();

      for (cpx $$1 : cpx.values()) {
         $$0.add(fol.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

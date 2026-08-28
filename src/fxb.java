import java.util.ArrayList;
import java.util.List;

public class fxb extends fxa {
   private static final xv a = xv.c("options.skinCustomisation.title");

   public fxb(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      List<fob> $$0 = new ArrayList<>();

      for (cpx $$1 : cpx.values()) {
         $$0.add(fok.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

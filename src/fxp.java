import java.util.ArrayList;
import java.util.List;

public class fxp extends fxo {
   private static final wo a = wo.c("options.skinCustomisation.title");

   public fxp(fuk $$0, fln $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fop> $$0 = new ArrayList<>();

      for (coy $$1 : coy.values()) {
         $$0.add(foz.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

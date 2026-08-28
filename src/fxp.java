import java.util.ArrayList;
import java.util.List;

public class fxp extends fxo {
   private static final wp a = wp.c("options.skinCustomisation.title");

   public fxp(fuk $$0, flm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fop> $$0 = new ArrayList<>();

      for (cox $$1 : cox.values()) {
         $$0.add(foz.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

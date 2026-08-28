import java.util.ArrayList;
import java.util.List;

public class fxq extends fxp {
   private static final wp a = wp.c("options.skinCustomisation.title");

   public fxq(ful $$0, fln $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<foq> $$0 = new ArrayList<>();

      for (coy $$1 : coy.values()) {
         $$0.add(fpa.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

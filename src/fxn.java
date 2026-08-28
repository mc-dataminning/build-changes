import java.util.ArrayList;
import java.util.List;

public class fxn extends fxm {
   private static final wo a = wo.c("options.skinCustomisation.title");

   public fxn(fui $$0, fll $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fon> $$0 = new ArrayList<>();

      for (cow $$1 : cow.values()) {
         $$0.add(fox.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

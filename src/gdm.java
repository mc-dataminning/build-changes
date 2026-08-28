import java.util.ArrayList;
import java.util.List;

public class gdm extends gdl {
   private static final xc a = xc.c("options.skinCustomisation.title");

   public gdm(gaf $$0, frj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<ful> $$0 = new ArrayList<>();

      for (csb $$1 : csb.values()) {
         $$0.add(fuu.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

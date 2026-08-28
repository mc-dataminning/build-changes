import java.util.ArrayList;
import java.util.List;

public class fut extends fus {
   private static final xl a = xl.c("options.skinCustomisation.title");

   public fut(frp $$0, fkb $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<flu> $$0 = new ArrayList<>();

      for (cos $$1 : cos.values()) {
         $$0.add(fmd.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}

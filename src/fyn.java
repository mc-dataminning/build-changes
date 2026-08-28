import java.util.ArrayList;
import java.util.List;

public class fyn extends fym {
   private static final wp a = wp.c("options.skinCustomisation.title");

   public fyn(fvi $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fpo> $$0 = new ArrayList<>();

      for (cps $$1 : cps.values()) {
         $$0.add(fpx.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

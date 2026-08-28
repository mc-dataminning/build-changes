import java.util.ArrayList;
import java.util.List;

public class gap extends gao {
   private static final ww a = ww.c("options.skinCustomisation.title");

   public gap(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fro> $$0 = new ArrayList<>();

      for (cqt $$1 : cqt.values()) {
         $$0.add(frx.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

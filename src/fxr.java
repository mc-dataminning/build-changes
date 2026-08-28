import java.util.ArrayList;
import java.util.List;

public class fxr extends fxq {
   private static final wp a = wp.c("options.skinCustomisation.title");

   public fxr(fum $$0, flo $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fos> $$0 = new ArrayList<>();

      for (coz $$1 : coz.values()) {
         $$0.add(fpb.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

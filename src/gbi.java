import java.util.ArrayList;
import java.util.List;

public class gbi extends gbh {
   private static final wy a = wy.c("options.skinCustomisation.title");

   public gbi(fyb $$0, fpd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fsh> $$0 = new ArrayList<>();

      for (cre $$1 : cre.values()) {
         $$0.add(fsq.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

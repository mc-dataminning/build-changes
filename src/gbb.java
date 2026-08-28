import java.util.ArrayList;
import java.util.List;

public class gbb extends gba {
   private static final wy a = wy.c("options.skinCustomisation.title");

   public gbb(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fsa> $$0 = new ArrayList<>();

      for (cqz $$1 : cqz.values()) {
         $$0.add(fsj.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

import java.util.ArrayList;
import java.util.List;

public class gcx extends gcw {
   private static final xg a = xg.c("options.skinCustomisation.title");

   public gcx(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<ftw> $$0 = new ArrayList<>();

      for (csk $$1 : csk.values()) {
         $$0.add(fuf.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

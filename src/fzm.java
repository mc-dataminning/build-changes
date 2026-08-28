import java.util.ArrayList;
import java.util.List;

public class fzm extends fzl {
   private static final wv a = wv.c("options.skinCustomisation.title");

   public fzm(fwf $$0, fnh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fql> $$0 = new ArrayList<>();

      for (cqj $$1 : cqj.values()) {
         $$0.add(fqu.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

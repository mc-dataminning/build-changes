import java.util.ArrayList;
import java.util.List;

public class gbu extends gbt {
   private static final wy a = wy.c("options.skinCustomisation.title");

   public gbu(fyn $$0, fps $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fst> $$0 = new ArrayList<>();

      for (crl $$1 : crl.values()) {
         $$0.add(ftc.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

import java.util.ArrayList;
import java.util.List;

public class gbz extends gby {
   private static final wy a = wy.c("options.skinCustomisation.title");

   public gbz(fys $$0, fpx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fsy> $$0 = new ArrayList<>();

      for (cro $$1 : cro.values()) {
         $$0.add(fth.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

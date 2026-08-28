import java.util.ArrayList;
import java.util.List;

public class gdk extends gdj {
   private static final xa a = xa.c("options.skinCustomisation.title");

   public gdk(gad $$0, frh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fuj> $$0 = new ArrayList<>();

      for (crz $$1 : crz.values()) {
         $$0.add(fus.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.x().a(this.c));
      this.d.a($$0);
   }
}

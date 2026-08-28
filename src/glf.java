import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class glf implements glg.a {
   private final fil a;
   private double b = Double.MIN_VALUE;
   private List<ezm> c = Collections.emptyList();

   public glf(fil $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fde $$0, ghg $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bto $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dS().d($$6, $$6.cO().g(6.0)));
      }

      fdi $$7 = $$1.getBuffer(ghq.y());

      for (ezm $$8 : this.c) {
         glg.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class ghq implements ghr.a {
   private final ffw a;
   private double b = Double.MIN_VALUE;
   private List<exa> c = Collections.emptyList();

   public ghq(ffw $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fao $$0, gef $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bsh $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dR().d($$6, $$6.cM().g(6.0)));
      }

      fas $$7 = $$1.getBuffer(gen.y());

      for (exa $$8 : this.c) {
         ged.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

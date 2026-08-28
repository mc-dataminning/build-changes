import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gpv implements gpw.a {
   private final flh a;
   private double b = Double.MIN_VALUE;
   private List<fbs> c = Collections.emptyList();

   public gpv(flh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ffs $$0, glv $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)af.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         buj $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dW().d($$6, $$6.cR().g(6.0)));
      }

      ffw $$7 = $$1.getBuffer(gmf.y());

      for (fbs $$8 : this.c) {
         gpw.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

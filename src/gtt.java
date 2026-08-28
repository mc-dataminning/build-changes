import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gtt implements gtu.a {
   private final fos a;
   private double b = Double.MIN_VALUE;
   private List<ffc> c = Collections.emptyList();

   public gtt(fos $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjc $$0, gps $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)af.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bwd $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dV().d($$6, $$6.cR().g(6.0)));
      }

      fjg $$7 = $$1.getBuffer(gqc.y());

      for (ffc $$8 : this.c) {
         gtu.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

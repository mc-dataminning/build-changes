import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class glv implements glw.a {
   private final fja a;
   private double b = Double.MIN_VALUE;
   private List<fab> c = Collections.emptyList();

   public glv(fja $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         btz $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dX().d($$6, $$6.cS().g(6.0)));
      }

      fdx $$7 = $$1.getBuffer(gig.y());

      for (fab $$8 : this.c) {
         glw.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

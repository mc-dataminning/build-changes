import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gep implements geq.a {
   private final fcu a;
   private double b = Double.MIN_VALUE;
   private List<ety> c = Collections.emptyList();

   public gep(fcu $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exn $$0, gbe $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bql $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dN().d($$6, $$6.cI().g(6.0)));
      }

      exr $$7 = $$1.getBuffer(gbm.y());

      for (ety $$8 : this.c) {
         gbc.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

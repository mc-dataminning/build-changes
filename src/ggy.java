import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class ggy implements ggz.a {
   private final ffe a;
   private double b = Double.MIN_VALUE;
   private List<ewj> c = Collections.emptyList();

   public ggy(ffe $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezx $$0, gdn $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bst $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dP().d($$6, $$6.cK().g(6.0)));
      }

      fab $$7 = $$1.getBuffer(gdv.y());

      for (ewj $$8 : this.c) {
         gdl.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

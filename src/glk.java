import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class glk implements gll.a {
   private final fip a;
   private double b = Double.MIN_VALUE;
   private List<ezq> c = Collections.emptyList();

   public glk(fip $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         btr $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dS().d($$6, $$6.cO().g(6.0)));
      }

      fdm $$7 = $$1.getBuffer(ghv.y());

      for (ezq $$8 : this.c) {
         gll.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

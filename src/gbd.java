import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gbd implements gbe.a {
   private final ezi a;
   private double b = Double.MIN_VALUE;
   private List<eqm> c = Collections.emptyList();

   public gbd(ezi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eub $$0, fxs $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         box $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      euf $$7 = $$1.getBuffer(fya.y());

      for (eqm $$8 : this.c) {
         fxq.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

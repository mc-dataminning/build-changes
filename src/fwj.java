import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fwj implements fwk.a {
   private final eva a;
   private double b = Double.MIN_VALUE;
   private List<emf> c = Collections.emptyList();

   public fwj(eva $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ept $$0, fsz $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         blp $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      epx $$7 = $$1.getBuffer(fth.w());

      for (emf $$8 : this.c) {
         fsx.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

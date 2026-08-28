import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gmw implements gmx.a {
   private final fjx a;
   private double b = Double.MIN_VALUE;
   private List<fal> c = Collections.emptyList();

   public gmw(fjx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fek $$0, gix $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ae.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bui $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dY().d($$6, $$6.cT().g(6.0)));
      }

      feo $$7 = $$1.getBuffer(gjh.y());

      for (fal $$8 : this.c) {
         gmx.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

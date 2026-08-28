import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gpd implements gpe.a {
   private final flz a;
   private double b = Double.MIN_VALUE;
   private List<fcm> c = Collections.emptyList();

   public gpd(flz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgl $$0, gle $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ae.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bvf $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dV().d($$6, $$6.cR().g(6.0)));
      }

      fgp $$7 = $$1.getBuffer(glo.y());

      for (fcm $$8 : this.c) {
         gpe.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

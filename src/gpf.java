import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gpf implements gpg.a {
   private final flz a;
   private double b = Double.MIN_VALUE;
   private List<fcl> c = Collections.emptyList();

   public gpf(flz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgl $$0, glg $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ae.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bvb $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dW().d($$6, $$6.cR().g(6.0)));
      }

      fgp $$7 = $$1.getBuffer(glq.y());

      for (fcl $$8 : this.c) {
         gpg.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gus implements gut.a {
   private final fpt a;
   private double b = Double.MIN_VALUE;
   private List<ffw> c = Collections.emptyList();

   public gus(fpt $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fkd $$0, gqr $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bwi $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dU().d($$6, $$6.cQ().g(6.0)));
      }

      fkh $$7 = $$1.getBuffer(grc.y());

      for (ffw $$8 : this.c) {
         gut.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

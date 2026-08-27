import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fzd implements fze.a {
   private final exo a;
   private double b = Double.MIN_VALUE;
   private List<eos> c = Collections.emptyList();

   public fzd(exo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bnq $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      esl $$7 = $$1.getBuffer(fwb.w());

      for (eos $$8 : this.c) {
         fvr.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

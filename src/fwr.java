import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fwr implements fws.a {
   private final evi a;
   private double b = Double.MIN_VALUE;
   private List<emm> c = Collections.emptyList();

   public fwr(evi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqb $$0, fth $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         blv $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      eqf $$7 = $$1.getBuffer(ftp.w());

      for (emm $$8 : this.c) {
         ftf.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

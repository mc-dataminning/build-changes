import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fwq implements fwr.a {
   private final evh a;
   private double b = Double.MIN_VALUE;
   private List<eml> c = Collections.emptyList();

   public fwq(evh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqa $$0, ftg $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         blu $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      eqe $$7 = $$1.getBuffer(fto.w());

      for (eml $$8 : this.c) {
         fte.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

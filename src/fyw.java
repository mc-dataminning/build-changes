import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fyw implements fyx.a {
   private final exh a;
   private double b = Double.MIN_VALUE;
   private List<eol> c = Collections.emptyList();

   public fyw(exh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esa $$0, fvm $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bno $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      ese $$7 = $$1.getBuffer(fvu.w());

      for (eol $$8 : this.c) {
         fvk.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

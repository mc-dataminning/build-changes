import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gdt implements gdu.a {
   private final fby a;
   private double b = Double.MIN_VALUE;
   private List<etc> c = Collections.emptyList();

   public gdt(fby $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bqa $$6 = this.a.j.n().g();
         this.c = ImmutableList.copyOf($$6.dM().d($$6, $$6.cH().g(6.0)));
      }

      ewv $$7 = $$1.getBuffer(gaq.y());

      for (etc $$8 : this.c) {
         gag.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

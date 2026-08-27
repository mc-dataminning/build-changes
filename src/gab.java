import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gab implements gac.a {
   private final eyk a;
   private double b = Double.MIN_VALUE;
   private List<epo> c = Collections.emptyList();

   public gab(eyk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(etd $$0, fwq $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bof $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dJ().d($$6, $$6.cE().g(6.0)));
      }

      eth $$7 = $$1.getBuffer(fwy.y());

      for (epo $$8 : this.c) {
         fwo.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

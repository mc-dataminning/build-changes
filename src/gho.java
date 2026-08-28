import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gho implements ghp.a {
   private final fft a;
   private double b = Double.MIN_VALUE;
   private List<ewy> c = Collections.emptyList();

   public gho(fft $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fam $$0, ged $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bsg $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dQ().d($$6, $$6.cL().g(6.0)));
      }

      faq $$7 = $$1.getBuffer(gel.y());

      for (ewy $$8 : this.c) {
         geb.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class ghb implements ghc.a {
   private final ffh a;
   private double b = Double.MIN_VALUE;
   private List<ewm> c = Collections.emptyList();

   public ghb(ffh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(faa $$0, gdq $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bsw $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dP().d($$6, $$6.cK().g(6.0)));
      }

      fae $$7 = $$1.getBuffer(gdy.y());

      for (ewm $$8 : this.c) {
         gdo.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

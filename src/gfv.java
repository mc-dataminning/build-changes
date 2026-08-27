import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gfv implements gfw.a {
   private final fdz a;
   private double b = Double.MIN_VALUE;
   private List<evd> c = Collections.emptyList();

   public gfv(fdz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eys $$0, gck $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bru $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dP().d($$6, $$6.cK().g(6.0)));
      }

      eyw $$7 = $$1.getBuffer(gcs.y());

      for (evd $$8 : this.c) {
         gci.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gnu implements gnv<gmm> {
   private final List<gnv<gmm>> a = Lists.newArrayList();
   @Nullable
   private final vu b;

   public gnu(ajh $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vu.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gnv<gmm> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gmm a(axd $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gnv<gmm> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gnt.a;
      } else {
         return gnt.a;
      }
   }

   public void a(gnv<gmm> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vu a() {
      return this.b;
   }

   @Override
   public void a(gnq $$0) {
      for (gnv<gmm> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

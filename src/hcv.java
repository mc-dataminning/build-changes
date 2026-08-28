import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hcv implements hcw<hbm> {
   private final List<hcw<hbm>> a = Lists.newArrayList();
   @Nullable
   private final xh b;

   public hcv(alh $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xh.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hcw<hbm> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hbm a(azr $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hcw<hbm> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hcu.b;
      } else {
         return hcu.b;
      }
   }

   public void a(hcw<hbm> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xh a() {
      return this.b;
   }

   @Override
   public void a(hcr $$0) {
      for (hcw<hbm> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

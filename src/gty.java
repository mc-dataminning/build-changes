import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gty implements gtz<gsm> {
   private final List<gtz<gsm>> a = Lists.newArrayList();
   @Nullable
   private final xp b;

   public gty(alf $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gtz<gsm> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsm a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gtz<gsm> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gtx.a;
      } else {
         return gtx.a;
      }
   }

   public void a(gtz<gsm> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xp a() {
      return this.b;
   }

   @Override
   public void a(gtu $$0) {
      for (gtz<gsm> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

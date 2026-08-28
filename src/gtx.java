import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gtx implements gty<gsl> {
   private final List<gty<gsl>> a = Lists.newArrayList();
   @Nullable
   private final xp b;

   public gtx(alf $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gty<gsl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsl a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gty<gsl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gtw.a;
      } else {
         return gtw.a;
      }
   }

   public void a(gty<gsl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xp a() {
      return this.b;
   }

   @Override
   public void a(gtt $$0) {
      for (gty<gsl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

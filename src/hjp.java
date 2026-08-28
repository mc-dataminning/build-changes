import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hjp implements hjq<hif> {
   private final List<hjq<hif>> a = Lists.newArrayList();
   @Nullable
   private final wo b;

   public hjp(aku $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wo.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hjq<hif> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hif a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hjq<hif> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hjo.b;
      } else {
         return hjo.b;
      }
   }

   public void a(hjq<hif> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wo a() {
      return this.b;
   }

   @Override
   public void a(hjl $$0) {
      for (hjq<hif> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

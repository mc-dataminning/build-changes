import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hqg implements hqh<how> {
   private final List<hqh<how>> a = Lists.newArrayList();
   @Nullable
   private final xc b;

   public hqg(alk $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xc.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hqh<how> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public how a(azz $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hqh<how> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hqf.b;
      } else {
         return hqf.b;
      }
   }

   public void a(hqh<how> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xc a() {
      return this.b;
   }

   @Override
   public void a(hqc $$0) {
      for (hqh<how> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hqe implements hqf<hou> {
   private final List<hqf<hou>> a = Lists.newArrayList();
   @Nullable
   private final xa b;

   public hqe(ali $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xa.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hqf<hou> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hou a(azx $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hqf<hou> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hqd.b;
      } else {
         return hqd.b;
      }
   }

   public void a(hqf<hou> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xa a() {
      return this.b;
   }

   @Override
   public void a(hqa $$0) {
      for (hqf<hou> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

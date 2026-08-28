import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hdw implements hdx<hcn> {
   private final List<hdx<hcn>> a = Lists.newArrayList();
   @Nullable
   private final xl b;

   public hdw(all $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xl.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hdx<hcn> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hcn a(azv $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hdx<hcn> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hdv.b;
      } else {
         return hdv.b;
      }
   }

   public void a(hdx<hcn> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xl a() {
      return this.b;
   }

   @Override
   public void a(hds $$0) {
      for (hdx<hcn> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

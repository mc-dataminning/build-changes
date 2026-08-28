import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hnt implements hnu<hmj> {
   private final List<hnu<hmj>> a = Lists.newArrayList();
   @Nullable
   private final wy b;

   public hnt(alg $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wy.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hnu<hmj> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hmj a(azv $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hnu<hmj> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hns.b;
      } else {
         return hns.b;
      }
   }

   public void a(hnu<hmj> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wy a() {
      return this.b;
   }

   @Override
   public void a(hnp $$0) {
      for (hnu<hmj> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

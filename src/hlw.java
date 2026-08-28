import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hlw implements hlx<hkm> {
   private final List<hlx<hkm>> a = Lists.newArrayList();
   @Nullable
   private final wv b;

   public hlw(ald $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hlx<hkm> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hkm a(azs $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hlx<hkm> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hlv.b;
      } else {
         return hlv.b;
      }
   }

   public void a(hlx<hkm> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wv a() {
      return this.b;
   }

   @Override
   public void a(hls $$0) {
      for (hlx<hkm> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

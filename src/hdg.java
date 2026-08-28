import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hdg implements hdh<hbx> {
   private final List<hdh<hbx>> a = Lists.newArrayList();
   @Nullable
   private final xi b;

   public hdg(ali $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xi.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hdh<hbx> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hbx a(azs $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hdh<hbx> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hdf.b;
      } else {
         return hdf.b;
      }
   }

   public void a(hdh<hbx> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xi a() {
      return this.b;
   }

   @Override
   public void a(hdc $$0) {
      for (hdh<hbx> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

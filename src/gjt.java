import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gjt implements gju<gil> {
   private final List<gju<gil>> a = Lists.newArrayList();
   @Nullable
   private final vg b;

   public gjt(ahh $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vg.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gju<gil> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gil a(auw $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gju<gil> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gjs.a;
      } else {
         return gjs.a;
      }
   }

   public void a(gju<gil> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vg a() {
      return this.b;
   }

   @Override
   public void a(gjp $$0) {
      for (gju<gil> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

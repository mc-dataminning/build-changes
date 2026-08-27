import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gdm implements gdn<gce> {
   private final List<gdn<gce>> a = Lists.newArrayList();
   @Nullable
   private final ti b;

   public gdm(aeu $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : ti.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gdn<gce> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gce a(arx $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gdn<gce> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gdl.a;
      } else {
         return gdl.a;
      }
   }

   public void a(gdn<gce> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ti a() {
      return this.b;
   }

   @Override
   public void a(gdi $$0) {
      for (gdn<gce> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

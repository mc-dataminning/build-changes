import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hcb implements hcc<has> {
   private final List<hcc<has>> a = Lists.newArrayList();
   @Nullable
   private final xd b;

   public hcb(alc $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xd.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hcc<has> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public has a(azl $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hcc<has> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hca.b;
      } else {
         return hca.b;
      }
   }

   public void a(hcc<has> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xd a() {
      return this.b;
   }

   @Override
   public void a(hbx $$0) {
      for (hcc<has> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hbk implements hbl<hab> {
   private final List<hbl<hab>> a = Lists.newArrayList();
   @Nullable
   private final xd b;

   public hbk(alb $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xd.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hbl<hab> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hab a(azk $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hbl<hab> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hbj.b;
      } else {
         return hbj.b;
      }
   }

   public void a(hbl<hab> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xd a() {
      return this.b;
   }

   @Override
   public void a(hbg $$0) {
      for (hbl<hab> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

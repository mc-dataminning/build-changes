import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gtr implements gts<gsf> {
   private final List<gts<gsf>> a = Lists.newArrayList();
   @Nullable
   private final xl b;

   public gtr(alb $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xl.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gts<gsf> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsf a(azc $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gts<gsf> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gtq.a;
      } else {
         return gtq.a;
      }
   }

   public void a(gts<gsf> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xl a() {
      return this.b;
   }

   @Override
   public void a(gtn $$0) {
      for (gts<gsf> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

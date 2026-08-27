import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gct implements gcu<gbl> {
   private final List<gcu<gbl>> a = Lists.newArrayList();
   @Nullable
   private final te b;

   public gct(aep $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : te.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gcu<gbl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gbl a(art $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gcu<gbl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gcs.a;
      } else {
         return gcs.a;
      }
   }

   public void a(gcu<gbl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public te a() {
      return this.b;
   }

   @Override
   public void a(gcp $$0) {
      for (gcu<gbl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

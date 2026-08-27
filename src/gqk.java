import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gqk implements gql<gpc> {
   private final List<gql<gpc>> a = Lists.newArrayList();
   @Nullable
   private final wi b;

   public gqk(ajv $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wi.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gql<gpc> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gpc a(axt $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gql<gpc> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gqj.a;
      } else {
         return gqj.a;
      }
   }

   public void a(gql<gpc> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wi a() {
      return this.b;
   }

   @Override
   public void a(gqg $$0) {
      for (gql<gpc> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

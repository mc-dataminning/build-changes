import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gnr implements gns<gmj> {
   private final List<gns<gmj>> a = Lists.newArrayList();
   @Nullable
   private final vu b;

   public gnr(ajh $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vu.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gns<gmj> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gmj a(axd $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gns<gmj> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gnq.a;
      } else {
         return gnq.a;
      }
   }

   public void a(gns<gmj> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vu a() {
      return this.b;
   }

   @Override
   public void a(gnn $$0) {
      for (gns<gmj> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gdr implements gds<gcj> {
   private final List<gds<gcj>> a = Lists.newArrayList();
   @Nullable
   private final tl b;

   public gdr(aew $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : tl.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gds<gcj> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gcj a(asc $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gds<gcj> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gdq.a;
      } else {
         return gdq.a;
      }
   }

   public void a(gds<gcj> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tl a() {
      return this.b;
   }

   @Override
   public void a(gdn $$0) {
      for (gds<gcj> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

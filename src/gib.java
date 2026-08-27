import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gib implements gic<ggt> {
   private final List<gic<ggt>> a = Lists.newArrayList();
   @Nullable
   private final vb b;

   public gib(agt $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vb.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gic<ggt> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public ggt a(auf $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gic<ggt> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gia.a;
      } else {
         return gia.a;
      }
   }

   public void a(gic<ggt> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vb a() {
      return this.b;
   }

   @Override
   public void a(ghx $$0) {
      for (gic<ggt> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

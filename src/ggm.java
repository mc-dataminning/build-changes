import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ggm implements ggn<gfe> {
   private final List<ggn<gfe>> a = Lists.newArrayList();
   @Nullable
   private final uv b;

   public ggm(agm $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : uv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (ggn<gfe> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gfe a(atw $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (ggn<gfe> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return ggl.a;
      } else {
         return ggl.a;
      }
   }

   public void a(ggn<gfe> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public uv a() {
      return this.b;
   }

   @Override
   public void a(ggi $$0) {
      for (ggn<gfe> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

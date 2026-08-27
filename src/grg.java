import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class grg implements grh<gpy> {
   private final List<grh<gpy>> a = Lists.newArrayList();
   @Nullable
   private final ws b;

   public grg(akf $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : ws.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (grh<gpy> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gpy a(ayd $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (grh<gpy> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return grf.a;
      } else {
         return grf.a;
      }
   }

   public void a(grh<gpy> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ws a() {
      return this.b;
   }

   @Override
   public void a(grc $$0) {
      for (grh<gpy> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

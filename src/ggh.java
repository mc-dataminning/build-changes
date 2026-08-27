import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ggh implements ggi<gez> {
   private final List<ggi<gez>> a = Lists.newArrayList();
   @Nullable
   private final ur b;

   public ggh(agi $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : ur.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (ggi<gez> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gez a(ats $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (ggi<gez> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return ggg.a;
      } else {
         return ggg.a;
      }
   }

   public void a(ggi<gez> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ur a() {
      return this.b;
   }

   @Override
   public void a(ggd $$0) {
      for (ggi<gez> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hjw implements hjx<him> {
   private final List<hjx<him>> a = Lists.newArrayList();
   @Nullable
   private final wp b;

   public hjw(akv $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hjx<him> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public him a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hjx<him> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hjv.b;
      } else {
         return hjv.b;
      }
   }

   public void a(hjx<him> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wp a() {
      return this.b;
   }

   @Override
   public void a(hjs $$0) {
      for (hjx<him> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

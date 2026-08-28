import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hjx implements hjy<hin> {
   private final List<hjy<hin>> a = Lists.newArrayList();
   @Nullable
   private final wp b;

   public hjx(akv $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hjy<hin> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hin a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hjy<hin> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hjw.b;
      } else {
         return hjw.b;
      }
   }

   public void a(hjy<hin> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wp a() {
      return this.b;
   }

   @Override
   public void a(hjt $$0) {
      for (hjy<hin> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

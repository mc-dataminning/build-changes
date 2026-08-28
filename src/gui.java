import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gui implements guj<gsz> {
   private final List<guj<gsz>> a = Lists.newArrayList();
   @Nullable
   private final wu b;

   public gui(akk $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wu.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (guj<gsz> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsz a(ayo $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (guj<gsz> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return guh.a;
      } else {
         return guh.a;
      }
   }

   public void a(guj<gsz> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wu a() {
      return this.b;
   }

   @Override
   public void a(gue $$0) {
      for (guj<gsz> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

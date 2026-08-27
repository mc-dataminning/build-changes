import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gdh implements gdi<gbz> {
   private final List<gdi<gbz>> a = Lists.newArrayList();
   @Nullable
   private final tf b;

   public gdh(aer $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : tf.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gdi<gbz> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gbz a(aru $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gdi<gbz> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gdg.a;
      } else {
         return gdg.a;
      }
   }

   public void a(gdi<gbz> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tf a() {
      return this.b;
   }

   @Override
   public void a(gdd $$0) {
      for (gdi<gbz> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

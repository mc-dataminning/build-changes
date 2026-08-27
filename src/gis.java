import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gis implements git<ghk> {
   private final List<git<ghk>> a = Lists.newArrayList();
   @Nullable
   private final vd b;

   public gis(ahd $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vd.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (git<ghk> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public ghk a(aup $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (git<ghk> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gir.a;
      } else {
         return gir.a;
      }
   }

   public void a(git<ghk> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vd a() {
      return this.b;
   }

   @Override
   public void a(gio $$0) {
      for (git<ghk> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

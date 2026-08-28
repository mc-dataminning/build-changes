import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class heh implements hei<hcy> {
   private final List<hei<hcy>> a = Lists.newArrayList();
   @Nullable
   private final xj b;

   public heh(alj $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xj.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hei<hcy> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hcy a(azu $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hei<hcy> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return heg.b;
      } else {
         return heg.b;
      }
   }

   public void a(hei<hcy> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xj a() {
      return this.b;
   }

   @Override
   public void a(hed $$0) {
      for (hei<hcy> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

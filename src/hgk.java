import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hgk implements hgl<hfa> {
   private final List<hgl<hfa>> a = Lists.newArrayList();
   @Nullable
   private final xk b;

   public hgk(alp $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xk.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hgl<hfa> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hfa a(bac $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hgl<hfa> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hgj.b;
      } else {
         return hgj.b;
      }
   }

   public void a(hgl<hfa> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xk a() {
      return this.b;
   }

   @Override
   public void a(hgg $$0) {
      for (hgl<hfa> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

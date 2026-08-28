import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hgh implements hgi<hey> {
   private final List<hgi<hey>> a = Lists.newArrayList();
   @Nullable
   private final xv b;

   public hgh(alz $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hgi<hey> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hey a(bam $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hgi<hey> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hgg.b;
      } else {
         return hgg.b;
      }
   }

   public void a(hgi<hey> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xv a() {
      return this.b;
   }

   @Override
   public void a(hgd $$0) {
      for (hgi<hey> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hgm implements hgn<hfd> {
   private final List<hgn<hfd>> a = Lists.newArrayList();
   @Nullable
   private final xv b;

   public hgm(alz $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hgn<hfd> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hfd a(bam $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hgn<hfd> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hgl.b;
      } else {
         return hgl.b;
      }
   }

   public void a(hgn<hfd> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xv a() {
      return this.b;
   }

   @Override
   public void a(hgi $$0) {
      for (hgn<hfd> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

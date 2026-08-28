import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hgn implements hgo<hfe> {
   private final List<hgo<hfe>> a = Lists.newArrayList();
   @Nullable
   private final xv b;

   public hgn(alz $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hgo<hfe> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hfe a(bam $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hgo<hfe> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hgm.b;
      } else {
         return hgm.b;
      }
   }

   public void a(hgo<hfe> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xv a() {
      return this.b;
   }

   @Override
   public void a(hgj $$0) {
      for (hgo<hfe> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

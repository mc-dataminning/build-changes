import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hgo implements hgp<hff> {
   private final List<hgp<hff>> a = Lists.newArrayList();
   @Nullable
   private final xv b;

   public hgo(alz $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xv.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hgp<hff> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hff a(bam $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hgp<hff> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hgn.b;
      } else {
         return hgn.b;
      }
   }

   public void a(hgp<hff> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xv a() {
      return this.b;
   }

   @Override
   public void a(hgk $$0) {
      for (hgp<hff> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

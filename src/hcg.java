import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hcg implements hch<hax> {
   private final List<hch<hax>> a = Lists.newArrayList();
   @Nullable
   private final xe b;

   public hcg(ale $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xe.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hch<hax> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hax a(azn $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hch<hax> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hcf.b;
      } else {
         return hcf.b;
      }
   }

   public void a(hch<hax> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xe a() {
      return this.b;
   }

   @Override
   public void a(hcc $$0) {
      for (hch<hax> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

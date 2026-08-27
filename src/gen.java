import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gen implements geo<gdf> {
   private final List<geo<gdf>> a = Lists.newArrayList();
   @Nullable
   private final ui b;

   public gen(afw $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : ui.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (geo<gdf> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gdf a(ate $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (geo<gdf> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gem.a;
      } else {
         return gem.a;
      }
   }

   public void a(geo<gdf> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ui a() {
      return this.b;
   }

   @Override
   public void a(gej $$0) {
      for (geo<gdf> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

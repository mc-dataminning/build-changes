import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hkv implements hkw<hjl> {
   private final List<hkw<hjl>> a = Lists.newArrayList();
   @Nullable
   private final wp b;

   public hkv(aku $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hkw<hjl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hjl a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hkw<hjl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hku.b;
      } else {
         return hku.b;
      }
   }

   public void a(hkw<hjl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wp a() {
      return this.b;
   }

   @Override
   public void a(hkr $$0) {
      for (hkw<hjl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

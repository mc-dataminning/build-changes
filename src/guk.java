import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class guk implements gul<gtb> {
   private final List<gul<gtb>> a = Lists.newArrayList();
   @Nullable
   private final wu b;

   public guk(akk $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wu.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gul<gtb> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gtb a(ayo $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gul<gtb> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return guj.a;
      } else {
         return guj.a;
      }
   }

   public void a(gul<gtb> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wu a() {
      return this.b;
   }

   @Override
   public void a(gug $$0) {
      for (gul<gtb> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

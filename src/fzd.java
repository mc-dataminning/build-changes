import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fzd implements fze<fxv> {
   private final List<fze<fxv>> a = Lists.newArrayList();
   @Nullable
   private final sw b;

   public fzd(acq $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : sw.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (fze<fxv> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public fxv a(apf $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (fze<fxv> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return fzc.a;
      } else {
         return fzc.a;
      }
   }

   public void a(fze<fxv> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public sw a() {
      return this.b;
   }

   @Override
   public void a(fyz $$0) {
      for (fze<fxv> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

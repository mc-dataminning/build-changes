import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class glt implements glu<gkl> {
   private final List<glu<gkl>> a = Lists.newArrayList();
   @Nullable
   private final vq b;

   public glt(aiy $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vq.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (glu<gkl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gkl a(awp $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (glu<gkl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gls.a;
      } else {
         return gls.a;
      }
   }

   public void a(glu<gkl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vq a() {
      return this.b;
   }

   @Override
   public void a(glp $$0) {
      for (glu<gkl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

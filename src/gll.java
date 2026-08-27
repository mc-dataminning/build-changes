import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gll implements glm<gkd> {
   private final List<glm<gkd>> a = Lists.newArrayList();
   @Nullable
   private final vq b;

   public gll(aiy $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vq.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (glm<gkd> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gkd a(awo $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (glm<gkd> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return glk.a;
      } else {
         return glk.a;
      }
   }

   public void a(glm<gkd> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vq a() {
      return this.b;
   }

   @Override
   public void a(glh $$0) {
      for (glm<gkd> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

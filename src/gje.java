import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gje implements gjf<ghw> {
   private final List<gjf<ghw>> a = Lists.newArrayList();
   @Nullable
   private final vf b;

   public gje(ahg $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vf.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gjf<ghw> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public ghw a(auu $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gjf<ghw> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gjd.a;
      } else {
         return gjd.a;
      }
   }

   public void a(gjf<ghw> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vf a() {
      return this.b;
   }

   @Override
   public void a(gja $$0) {
      for (gjf<ghw> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

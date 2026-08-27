import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gjf implements gjg<ghx> {
   private final List<gjg<ghx>> a = Lists.newArrayList();
   @Nullable
   private final vf b;

   public gjf(ahg $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vf.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gjg<ghx> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public ghx a(auv $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gjg<ghx> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gje.a;
      } else {
         return gje.a;
      }
   }

   public void a(gjg<ghx> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vf a() {
      return this.b;
   }

   @Override
   public void a(gjb $$0) {
      for (gjg<ghx> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

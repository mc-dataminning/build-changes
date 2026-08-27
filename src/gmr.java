import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gmr implements gms<glj> {
   private final List<gms<glj>> a = Lists.newArrayList();
   @Nullable
   private final vs b;

   public gmr(ajc $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : vs.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gms<glj> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public glj a(awt $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gms<glj> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gmq.a;
      } else {
         return gmq.a;
      }
   }

   public void a(gms<glj> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vs a() {
      return this.b;
   }

   @Override
   public void a(gmn $$0) {
      for (gms<glj> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

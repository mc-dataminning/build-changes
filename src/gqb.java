import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gqb implements gqc<got> {
   private final List<gqc<got>> a = Lists.newArrayList();
   @Nullable
   private final wg b;

   public gqb(ajt $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wg.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gqc<got> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public got a(axr $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gqc<got> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gqa.a;
      } else {
         return gqa.a;
      }
   }

   public void a(gqc<got> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wg a() {
      return this.b;
   }

   @Override
   public void a(gpx $$0) {
      for (gqc<got> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

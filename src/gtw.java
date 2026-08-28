import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gtw implements gtx<gsk> {
   private final List<gtx<gsk>> a = Lists.newArrayList();
   @Nullable
   private final xp b;

   public gtw(alf $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xp.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gtx<gsk> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsk a(azh $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gtx<gsk> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gtv.a;
      } else {
         return gtv.a;
      }
   }

   public void a(gtx<gsk> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xp a() {
      return this.b;
   }

   @Override
   public void a(gts $$0) {
      for (gtx<gsk> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

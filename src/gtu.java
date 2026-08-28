import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gtu implements gtv<gsi> {
   private final List<gtv<gsi>> a = Lists.newArrayList();
   @Nullable
   private final xo b;

   public gtu(ale $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xo.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gtv<gsi> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gsi a(azf $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gtv<gsi> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gtt.a;
      } else {
         return gtt.a;
      }
   }

   public void a(gtv<gsi> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xo a() {
      return this.b;
   }

   @Override
   public void a(gtq $$0) {
      for (gtv<gsi> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

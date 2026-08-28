import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class guz implements gva<gtq> {
   private final List<gva<gtq>> a = Lists.newArrayList();
   @Nullable
   private final wy b;

   public guz(akq $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wy.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gva<gtq> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gtq a(ayv $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gva<gtq> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return guy.b;
      } else {
         return guy.b;
      }
   }

   public void a(gva<gtq> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wy a() {
      return this.b;
   }

   @Override
   public void a(guv $$0) {
      for (gva<gtq> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

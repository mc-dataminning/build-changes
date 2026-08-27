import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gso implements gsp<grg> {
   private final List<gsp<grg>> a = Lists.newArrayList();
   @Nullable
   private final wx b;

   public gso(akn $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wx.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gsp<grg> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public grg a(aym $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gsp<grg> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gsn.a;
      } else {
         return gsn.a;
      }
   }

   public void a(gsp<grg> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wx a() {
      return this.b;
   }

   @Override
   public void a(gsk $$0) {
      for (gsp<grg> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

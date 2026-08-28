import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gvg implements gvh<gtx> {
   private final List<gvh<gtx>> a = Lists.newArrayList();
   @Nullable
   private final wz b;

   public gvg(akr $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wz.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gvh<gtx> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gtx a(ayw $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gvh<gtx> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gvf.b;
      } else {
         return gvf.b;
      }
   }

   public void a(gvh<gtx> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wz a() {
      return this.b;
   }

   @Override
   public void a(gvc $$0) {
      for (gvh<gtx> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

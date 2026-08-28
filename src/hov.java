import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hov implements how<hnl> {
   private final List<how<hnl>> a = Lists.newArrayList();
   @Nullable
   private final wy b;

   public hov(alg $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : wy.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (how<hnl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hnl a(azv $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (how<hnl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hou.b;
      } else {
         return hou.b;
      }
   }

   public void a(how<hnl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wy a() {
      return this.b;
   }

   @Override
   public void a(hor $$0) {
      for (how<hnl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}

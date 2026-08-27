import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ggz implements ggn {
   private final int a;
   private final List<bin.b<ggn>> b;
   private final ggn c;

   public ggz(List<bin.b<ggn>> $$0) {
      this.b = $$0;
      this.a = bio.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fue> a(@Nullable djh $$0, @Nullable ic $$1, auv $$2) {
      return bio.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }

   @Override
   public boolean a() {
      return this.c.a();
   }

   @Override
   public boolean b() {
      return this.c.b();
   }

   @Override
   public boolean c() {
      return this.c.c();
   }

   @Override
   public boolean d() {
      return this.c.d();
   }

   @Override
   public gen e() {
      return this.c.e();
   }

   @Override
   public fuq f() {
      return this.c.f();
   }

   @Override
   public fuo g() {
      return this.c.g();
   }

   public static class a {
      private final List<bin.b<ggn>> a = Lists.newArrayList();

      public ggz.a a(@Nullable ggn $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bin.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public ggn a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (ggn)(this.a.size() == 1 ? this.a.get(0).b() : new ggz(this.a));
         }
      }
   }
}

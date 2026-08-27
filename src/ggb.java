import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ggb implements gfp {
   private final int a;
   private final List<bhx.b<gfp>> b;
   private final gfp c;

   public ggb(List<bhx.b<gfp>> $$0) {
      this.b = $$0;
      this.a = bhy.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<ftf> a(@Nullable dip $$0, @Nullable ia $$1, auf $$2) {
      return bhy.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gdo e() {
      return this.c.e();
   }

   @Override
   public ftr f() {
      return this.c.f();
   }

   @Override
   public ftp g() {
      return this.c.g();
   }

   public static class a {
      private final List<bhx.b<gfp>> a = Lists.newArrayList();

      public ggb.a a(@Nullable gfp $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bhx.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gfp a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gfp)(this.a.size() == 1 ? this.a.get(0).b() : new ggb(this.a));
         }
      }
   }
}

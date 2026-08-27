import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gjf implements git {
   private final int a;
   private final List<bkg.b<git>> b;
   private final git c;

   public gjf(List<bkg.b<git>> $$0) {
      this.b = $$0;
      this.a = bkh.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fwi> a(@Nullable dlf $$0, @Nullable ie $$1, awo $$2) {
      return bkh.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public ggt e() {
      return this.c.e();
   }

   @Override
   public fwu f() {
      return this.c.f();
   }

   @Override
   public fws g() {
      return this.c.g();
   }

   public static class a {
      private final List<bkg.b<git>> a = Lists.newArrayList();

      public gjf.a a(@Nullable git $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bkg.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public git a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (git)(this.a.size() == 1 ? this.a.get(0).b() : new gjf(this.a));
         }
      }
   }
}

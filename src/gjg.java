import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gjg implements giu {
   private final int a;
   private final List<bkg.b<giu>> b;
   private final giu c;

   public gjg(List<bkg.b<giu>> $$0) {
      this.b = $$0;
      this.a = bkh.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fwj> a(@Nullable dlf $$0, @Nullable ie $$1, awo $$2) {
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
   public ggu e() {
      return this.c.e();
   }

   @Override
   public fwv f() {
      return this.c.f();
   }

   @Override
   public fwt g() {
      return this.c.g();
   }

   public static class a {
      private final List<bkg.b<giu>> a = Lists.newArrayList();

      public gjg.a a(@Nullable giu $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bkg.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public giu a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (giu)(this.a.size() == 1 ? this.a.get(0).b() : new gjg(this.a));
         }
      }
   }
}

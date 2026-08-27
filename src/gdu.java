import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gdu implements gdi {
   private final int a;
   private final List<bhc.b<gdi>> b;
   private final gdi c;

   public gdu(List<bhc.b<gdi>> $$0) {
      this.b = $$0;
      this.a = bhd.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fre> a(@Nullable dgw $$0, @Nullable hx $$1, ato $$2) {
      return bhd.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gbh e() {
      return this.c.e();
   }

   @Override
   public frq f() {
      return this.c.f();
   }

   @Override
   public fro g() {
      return this.c.g();
   }

   public static class a {
      private final List<bhc.b<gdi>> a = Lists.newArrayList();

      public gdu.a a(@Nullable gdi $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bhc.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gdi a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gdi)(this.a.size() == 1 ? this.a.get(0).b() : new gdu(this.a));
         }
      }
   }
}

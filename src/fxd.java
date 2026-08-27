import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fxd implements fwr {
   private final int a;
   private final List<bcj.b<fwr>> b;
   private final fwr c;

   public fxd(List<bcj.b<fwr>> $$0) {
      this.b = $$0;
      this.a = bck.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fkr> a(@Nullable dcb $$0, @Nullable ha $$1, apf $$2) {
      return bck.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fuv e() {
      return this.c.e();
   }

   @Override
   public fld f() {
      return this.c.f();
   }

   @Override
   public flb g() {
      return this.c.g();
   }

   public static class a {
      private final List<bcj.b<fwr>> a = Lists.newArrayList();

      public fxd.a a(@Nullable fwr $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bcj.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public fwr a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (fwr)(this.a.size() == 1 ? this.a.get(0).b() : new fxd(this.a));
         }
      }
   }
}

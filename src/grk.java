import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grk implements gqy {
   private final int a;
   private final List<bpe.b<gqy>> b;
   private final gqy c;

   public grk(List<bpe.b<gqy>> $$0) {
      this.b = $$0;
      this.a = bpf.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gej> a(@Nullable dsa $$0, @Nullable je $$1, azf $$2) {
      return bpf.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gox e() {
      return this.c.e();
   }

   @Override
   public gev f() {
      return this.c.f();
   }

   @Override
   public get g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpe.b<gqy>> a = Lists.newArrayList();

      public grk.a a(@Nullable gqy $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpe.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gqy a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gqy)(this.a.size() == 1 ? this.a.get(0).b() : new grk(this.a));
         }
      }
   }
}

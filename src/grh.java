import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grh implements gqv {
   private final int a;
   private final List<bpb.b<gqv>> b;
   private final gqv c;

   public grh(List<bpb.b<gqv>> $$0) {
      this.b = $$0;
      this.a = bpc.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<geg> a(@Nullable drx $$0, @Nullable je $$1, azc $$2) {
      return bpc.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gou e() {
      return this.c.e();
   }

   @Override
   public ges f() {
      return this.c.f();
   }

   @Override
   public geq g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpb.b<gqv>> a = Lists.newArrayList();

      public grh.a a(@Nullable gqv $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpb.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gqv a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gqv)(this.a.size() == 1 ? this.a.get(0).b() : new grh(this.a));
         }
      }
   }
}

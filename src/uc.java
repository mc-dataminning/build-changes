import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class uc extends ud {
   private int a;
   private final Set<tx<?>> b;
   private final Deque<uf> c = new ArrayDeque<>();

   public uc(ue... $$0) {
      this.a = $$0.length;
      Builder<tx<?>> $$1 = ImmutableSet.builder();
      uf $$2 = uf.a();

      for (ue $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(sy.b);
      this.b = $$1.build();
   }

   @Override
   public ts.b b(tx<?> $$0) {
      return $$0 != sy.b ? ts.b.c : super.b($$0);
   }

   @Override
   public ts.a a(tx<?> $$0) {
      uf $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ts.a.d;
      } else {
         return !this.b.contains($$0) ? ts.a.b : super.a($$0);
      }
   }

   @Override
   public ts.a a(tx<?> $$0, String $$1) {
      uf $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == sy.b) {
            uf $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ts.a.b;
      }
   }

   @Override
   public ts.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

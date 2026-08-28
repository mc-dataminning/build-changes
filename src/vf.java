import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vf extends vg {
   private int a;
   private final Set<va<?>> b;
   private final Deque<vi> c = new ArrayDeque<>();

   public vf(vh... $$0) {
      this.a = $$0.length;
      Builder<va<?>> $$1 = ImmutableSet.builder();
      vi $$2 = vi.a();

      for (vh $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ub.b);
      this.b = $$1.build();
   }

   @Override
   public uv.b b(va<?> $$0) {
      return $$0 != ub.b ? uv.b.c : super.b($$0);
   }

   @Override
   public uv.a a(va<?> $$0) {
      vi $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return uv.a.d;
      } else {
         return !this.b.contains($$0) ? uv.a.b : super.a($$0);
      }
   }

   @Override
   public uv.a a(va<?> $$0, String $$1) {
      vi $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ub.b) {
            vi $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return uv.a.b;
      }
   }

   @Override
   public uv.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class rz extends sa {
   private int a;
   private final Set<ru<?>> b;
   private final Deque<sc> c = new ArrayDeque<>();

   public rz(sb... $$0) {
      this.a = $$0.length;
      Builder<ru<?>> $$1 = ImmutableSet.builder();
      sc $$2 = sc.a();

      for (sb $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(qy.b);
      this.b = $$1.build();
   }

   @Override
   public rp.b b(ru<?> $$0) {
      return $$0 != qy.b ? rp.b.c : super.b($$0);
   }

   @Override
   public rp.a a(ru<?> $$0) {
      sc $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return rp.a.d;
      } else {
         return !this.b.contains($$0) ? rp.a.b : super.a($$0);
      }
   }

   @Override
   public rp.a a(ru<?> $$0, String $$1) {
      sc $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == qy.b) {
            sc $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return rp.a.b;
      }
   }

   @Override
   public rp.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

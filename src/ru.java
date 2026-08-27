import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class ru extends rv {
   private int a;
   private final Set<rp<?>> b;
   private final Deque<rx> c = new ArrayDeque<>();

   public ru(rw... $$0) {
      this.a = $$0.length;
      Builder<rp<?>> $$1 = ImmutableSet.builder();
      rx $$2 = rx.a();

      for (rw $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(qu.b);
      this.b = $$1.build();
   }

   @Override
   public rk.b b(rp<?> $$0) {
      return $$0 != qu.b ? rk.b.c : super.b($$0);
   }

   @Override
   public rk.a a(rp<?> $$0) {
      rx $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return rk.a.d;
      } else {
         return !this.b.contains($$0) ? rk.a.b : super.a($$0);
      }
   }

   @Override
   public rk.a a(rp<?> $$0, String $$1) {
      rx $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == qu.b) {
            rx $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return rk.a.b;
      }
   }

   @Override
   public rk.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

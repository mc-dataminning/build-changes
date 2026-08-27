import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class rx extends ry {
   private int a;
   private final Set<rs<?>> b;
   private final Deque<sa> c = new ArrayDeque<>();

   public rx(rz... $$0) {
      this.a = $$0.length;
      Builder<rs<?>> $$1 = ImmutableSet.builder();
      sa $$2 = sa.a();

      for (rz $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(qw.b);
      this.b = $$1.build();
   }

   @Override
   public rn.b b(rs<?> $$0) {
      return $$0 != qw.b ? rn.b.c : super.b($$0);
   }

   @Override
   public rn.a a(rs<?> $$0) {
      sa $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return rn.a.d;
      } else {
         return !this.b.contains($$0) ? rn.a.b : super.a($$0);
      }
   }

   @Override
   public rn.a a(rs<?> $$0, String $$1) {
      sa $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == qw.b) {
            sa $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return rn.a.b;
      }
   }

   @Override
   public rn.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

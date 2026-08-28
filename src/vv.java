import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vv extends vw {
   private int a;
   private final Set<vq<?>> b;
   private final Deque<vy> c = new ArrayDeque<>();

   public vv(vx... $$0) {
      this.a = $$0.length;
      Builder<vq<?>> $$1 = ImmutableSet.builder();
      vy $$2 = vy.a();

      for (vx $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ur.b);
      this.b = $$1.build();
   }

   @Override
   public vl.b b(vq<?> $$0) {
      return $$0 != ur.b ? vl.b.c : super.b($$0);
   }

   @Override
   public vl.a a(vq<?> $$0) {
      vy $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vl.a.d;
      } else {
         return !this.b.contains($$0) ? vl.a.b : super.a($$0);
      }
   }

   @Override
   public vl.a a(vq<?> $$0, String $$1) {
      vy $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ur.b) {
            vy $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vl.a.b;
      }
   }

   @Override
   public vl.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

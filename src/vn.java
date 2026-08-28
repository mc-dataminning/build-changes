import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vn extends vo {
   private int a;
   private final Set<vi<?>> b;
   private final Deque<vq> c = new ArrayDeque<>();

   public vn(vp... $$0) {
      this.a = $$0.length;
      Builder<vi<?>> $$1 = ImmutableSet.builder();
      vq $$2 = vq.a();

      for (vp $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(uj.b);
      this.b = $$1.build();
   }

   @Override
   public vd.b b(vi<?> $$0) {
      return $$0 != uj.b ? vd.b.c : super.b($$0);
   }

   @Override
   public vd.a a(vi<?> $$0) {
      vq $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vd.a.d;
      } else {
         return !this.b.contains($$0) ? vd.a.b : super.a($$0);
      }
   }

   @Override
   public vd.a a(vi<?> $$0, String $$1) {
      vq $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == uj.b) {
            vq $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vd.a.b;
      }
   }

   @Override
   public vd.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

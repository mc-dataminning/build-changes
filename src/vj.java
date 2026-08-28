import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vj extends vk {
   private int a;
   private final Set<ve<?>> b;
   private final Deque<vm> c = new ArrayDeque<>();

   public vj(vl... $$0) {
      this.a = $$0.length;
      Builder<ve<?>> $$1 = ImmutableSet.builder();
      vm $$2 = vm.a();

      for (vl $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(uf.b);
      this.b = $$1.build();
   }

   @Override
   public uz.b b(ve<?> $$0) {
      return $$0 != uf.b ? uz.b.c : super.b($$0);
   }

   @Override
   public uz.a a(ve<?> $$0) {
      vm $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return uz.a.d;
      } else {
         return !this.b.contains($$0) ? uz.a.b : super.a($$0);
      }
   }

   @Override
   public uz.a a(ve<?> $$0, String $$1) {
      vm $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == uf.b) {
            vm $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return uz.a.b;
      }
   }

   @Override
   public uz.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

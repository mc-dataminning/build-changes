import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vk extends vl {
   private int a;
   private final Set<vf<?>> b;
   private final Deque<vn> c = new ArrayDeque<>();

   public vk(vm... $$0) {
      this.a = $$0.length;
      Builder<vf<?>> $$1 = ImmutableSet.builder();
      vn $$2 = vn.a();

      for (vm $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ug.b);
      this.b = $$1.build();
   }

   @Override
   public va.b b(vf<?> $$0) {
      return $$0 != ug.b ? va.b.c : super.b($$0);
   }

   @Override
   public va.a a(vf<?> $$0) {
      vn $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return va.a.d;
      } else {
         return !this.b.contains($$0) ? va.a.b : super.a($$0);
      }
   }

   @Override
   public va.a a(vf<?> $$0, String $$1) {
      vn $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ug.b) {
            vn $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return va.a.b;
      }
   }

   @Override
   public va.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

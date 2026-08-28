import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vr extends vs {
   private int a;
   private final Set<vm<?>> b;
   private final Deque<vu> c = new ArrayDeque<>();

   public vr(vt... $$0) {
      this.a = $$0.length;
      Builder<vm<?>> $$1 = ImmutableSet.builder();
      vu $$2 = vu.a();

      for (vt $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(un.b);
      this.b = $$1.build();
   }

   @Override
   public vh.b b(vm<?> $$0) {
      return $$0 != un.b ? vh.b.c : super.b($$0);
   }

   @Override
   public vh.a a(vm<?> $$0) {
      vu $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vh.a.d;
      } else {
         return !this.b.contains($$0) ? vh.a.b : super.a($$0);
      }
   }

   @Override
   public vh.a a(vm<?> $$0, String $$1) {
      vu $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == un.b) {
            vu $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vh.a.b;
      }
   }

   @Override
   public vh.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

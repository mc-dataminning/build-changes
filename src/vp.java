import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vp extends vq {
   private int a;
   private final Set<vk<?>> b;
   private final Deque<vs> c = new ArrayDeque<>();

   public vp(vr... $$0) {
      this.a = $$0.length;
      Builder<vk<?>> $$1 = ImmutableSet.builder();
      vs $$2 = vs.a();

      for (vr $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ul.b);
      this.b = $$1.build();
   }

   @Override
   public vf.b b(vk<?> $$0) {
      return $$0 != ul.b ? vf.b.c : super.b($$0);
   }

   @Override
   public vf.a a(vk<?> $$0) {
      vs $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vf.a.d;
      } else {
         return !this.b.contains($$0) ? vf.a.b : super.a($$0);
      }
   }

   @Override
   public vf.a a(vk<?> $$0, String $$1) {
      vs $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ul.b) {
            vs $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vf.a.b;
      }
   }

   @Override
   public vf.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

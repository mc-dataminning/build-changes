import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vc extends vd {
   private int a;
   private final Set<ux<?>> b;
   private final Deque<vf> c = new ArrayDeque<>();

   public vc(ve... $$0) {
      this.a = $$0.length;
      Builder<ux<?>> $$1 = ImmutableSet.builder();
      vf $$2 = vf.a();

      for (ve $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ty.b);
      this.b = $$1.build();
   }

   @Override
   public us.b b(ux<?> $$0) {
      return $$0 != ty.b ? us.b.c : super.b($$0);
   }

   @Override
   public us.a a(ux<?> $$0) {
      vf $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return us.a.d;
      } else {
         return !this.b.contains($$0) ? us.a.b : super.a($$0);
      }
   }

   @Override
   public us.a a(ux<?> $$0, String $$1) {
      vf $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ty.b) {
            vf $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return us.a.b;
      }
   }

   @Override
   public us.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

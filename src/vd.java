import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vd extends ve {
   private int a;
   private final Set<uy<?>> b;
   private final Deque<vg> c = new ArrayDeque<>();

   public vd(vf... $$0) {
      this.a = $$0.length;
      Builder<uy<?>> $$1 = ImmutableSet.builder();
      vg $$2 = vg.a();

      for (vf $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(tz.b);
      this.b = $$1.build();
   }

   @Override
   public ut.b b(uy<?> $$0) {
      return $$0 != tz.b ? ut.b.c : super.b($$0);
   }

   @Override
   public ut.a a(uy<?> $$0) {
      vg $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ut.a.d;
      } else {
         return !this.b.contains($$0) ? ut.a.b : super.a($$0);
      }
   }

   @Override
   public ut.a a(uy<?> $$0, String $$1) {
      vg $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == tz.b) {
            vg $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ut.a.b;
      }
   }

   @Override
   public ut.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

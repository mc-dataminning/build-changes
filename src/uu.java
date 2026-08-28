import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class uu extends uv {
   private int a;
   private final Set<up<?>> b;
   private final Deque<ux> c = new ArrayDeque<>();

   public uu(uw... $$0) {
      this.a = $$0.length;
      Builder<up<?>> $$1 = ImmutableSet.builder();
      ux $$2 = ux.a();

      for (uw $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(tq.b);
      this.b = $$1.build();
   }

   @Override
   public uk.b b(up<?> $$0) {
      return $$0 != tq.b ? uk.b.c : super.b($$0);
   }

   @Override
   public uk.a a(up<?> $$0) {
      ux $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return uk.a.d;
      } else {
         return !this.b.contains($$0) ? uk.a.b : super.a($$0);
      }
   }

   @Override
   public uk.a a(up<?> $$0, String $$1) {
      ux $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == tq.b) {
            ux $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return uk.a.b;
      }
   }

   @Override
   public uk.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

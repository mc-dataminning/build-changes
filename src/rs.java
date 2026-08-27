import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class rs extends rt {
   private int a;
   private final Set<rn<?>> b;
   private final Deque<rv> c = new ArrayDeque<>();

   public rs(ru... $$0) {
      this.a = $$0.length;
      Builder<rn<?>> $$1 = ImmutableSet.builder();
      rv $$2 = rv.a();

      for (ru $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(qs.b);
      this.b = $$1.build();
   }

   @Override
   public ri.b b(rn<?> $$0) {
      return $$0 != qs.b ? ri.b.c : super.b($$0);
   }

   @Override
   public ri.a a(rn<?> $$0) {
      rv $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ri.a.d;
      } else {
         return !this.b.contains($$0) ? ri.a.b : super.a($$0);
      }
   }

   @Override
   public ri.a a(rn<?> $$0, String $$1) {
      rv $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == qs.b) {
            rv $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ri.a.b;
      }
   }

   @Override
   public ri.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

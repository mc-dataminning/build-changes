import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class va extends vb {
   private int a;
   private final Set<uv<?>> b;
   private final Deque<vd> c = new ArrayDeque<>();

   public va(vc... $$0) {
      this.a = $$0.length;
      Builder<uv<?>> $$1 = ImmutableSet.builder();
      vd $$2 = vd.a();

      for (vc $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(tw.b);
      this.b = $$1.build();
   }

   @Override
   public uq.b b(uv<?> $$0) {
      return $$0 != tw.b ? uq.b.c : super.b($$0);
   }

   @Override
   public uq.a a(uv<?> $$0) {
      vd $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return uq.a.d;
      } else {
         return !this.b.contains($$0) ? uq.a.b : super.a($$0);
      }
   }

   @Override
   public uq.a a(uv<?> $$0, String $$1) {
      vd $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == tw.b) {
            vd $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return uq.a.b;
      }
   }

   @Override
   public uq.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class wb extends wc {
   private int a;
   private final Set<vw<?>> b;
   private final Deque<we> c = new ArrayDeque<>();

   public wb(wd... $$0) {
      this.a = $$0.length;
      Builder<vw<?>> $$1 = ImmutableSet.builder();
      we $$2 = we.a();

      for (wd $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(ux.b);
      this.b = $$1.build();
   }

   @Override
   public vr.b b(vw<?> $$0) {
      return $$0 != ux.b ? vr.b.c : super.b($$0);
   }

   @Override
   public vr.a a(vw<?> $$0) {
      we $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vr.a.d;
      } else {
         return !this.b.contains($$0) ? vr.a.b : super.a($$0);
      }
   }

   @Override
   public vr.a a(vw<?> $$0, String $$1) {
      we $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == ux.b) {
            we $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vr.a.b;
      }
   }

   @Override
   public vr.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

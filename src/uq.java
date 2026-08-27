import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class uq extends ur {
   private int a;
   private final Set<ul<?>> b;
   private final Deque<ut> c = new ArrayDeque<>();

   public uq(us... $$0) {
      this.a = $$0.length;
      Builder<ul<?>> $$1 = ImmutableSet.builder();
      ut $$2 = ut.a();

      for (us $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(tm.b);
      this.b = $$1.build();
   }

   @Override
   public ug.b b(ul<?> $$0) {
      return $$0 != tm.b ? ug.b.c : super.b($$0);
   }

   @Override
   public ug.a a(ul<?> $$0) {
      ut $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ug.a.d;
      } else {
         return !this.b.contains($$0) ? ug.a.b : super.a($$0);
      }
   }

   @Override
   public ug.a a(ul<?> $$0, String $$1) {
      ut $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == tm.b) {
            ut $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ug.a.b;
      }
   }

   @Override
   public ug.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class su extends sv {
   private int a;
   private final Set<sp<?>> b;
   private final Deque<sx> c = new ArrayDeque<>();

   public su(sw... $$0) {
      this.a = $$0.length;
      Builder<sp<?>> $$1 = ImmutableSet.builder();
      sx $$2 = sx.a();

      for (sw $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(rt.b);
      this.b = $$1.build();
   }

   @Override
   public sk.b b(sp<?> $$0) {
      return $$0 != rt.b ? sk.b.c : super.b($$0);
   }

   @Override
   public sk.a a(sp<?> $$0) {
      sx $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return sk.a.d;
      } else {
         return !this.b.contains($$0) ? sk.a.b : super.a($$0);
      }
   }

   @Override
   public sk.a a(sp<?> $$0, String $$1) {
      sx $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == rt.b) {
            sx $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return sk.a.b;
      }
   }

   @Override
   public sk.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class us extends ut {
   private int a;
   private final Set<un<?>> b;
   private final Deque<uv> c = new ArrayDeque<>();

   public us(uu... $$0) {
      this.a = $$0.length;
      Builder<un<?>> $$1 = ImmutableSet.builder();
      uv $$2 = uv.a();

      for (uu $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(to.b);
      this.b = $$1.build();
   }

   @Override
   public ui.b b(un<?> $$0) {
      return $$0 != to.b ? ui.b.c : super.b($$0);
   }

   @Override
   public ui.a a(un<?> $$0) {
      uv $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ui.a.d;
      } else {
         return !this.b.contains($$0) ? ui.a.b : super.a($$0);
      }
   }

   @Override
   public ui.a a(un<?> $$0, String $$1) {
      uv $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == to.b) {
            uv $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ui.a.b;
      }
   }

   @Override
   public ui.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

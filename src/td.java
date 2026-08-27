import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class td extends te {
   private int a;
   private final Set<sy<?>> b;
   private final Deque<tg> c = new ArrayDeque<>();

   public td(tf... $$0) {
      this.a = $$0.length;
      Builder<sy<?>> $$1 = ImmutableSet.builder();
      tg $$2 = tg.a();

      for (tf $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(rz.b);
      this.b = $$1.build();
   }

   @Override
   public st.b b(sy<?> $$0) {
      return $$0 != rz.b ? st.b.c : super.b($$0);
   }

   @Override
   public st.a a(sy<?> $$0) {
      tg $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return st.a.d;
      } else {
         return !this.b.contains($$0) ? st.a.b : super.a($$0);
      }
   }

   @Override
   public st.a a(sy<?> $$0, String $$1) {
      tg $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == rz.b) {
            tg $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return st.a.b;
      }
   }

   @Override
   public st.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

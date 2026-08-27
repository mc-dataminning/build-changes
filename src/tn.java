import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class tn extends to {
   private int a;
   private final Set<ti<?>> b;
   private final Deque<tq> c = new ArrayDeque<>();

   public tn(tp... $$0) {
      this.a = $$0.length;
      Builder<ti<?>> $$1 = ImmutableSet.builder();
      tq $$2 = tq.a();

      for (tp $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(sj.b);
      this.b = $$1.build();
   }

   @Override
   public td.b b(ti<?> $$0) {
      return $$0 != sj.b ? td.b.c : super.b($$0);
   }

   @Override
   public td.a a(ti<?> $$0) {
      tq $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return td.a.d;
      } else {
         return !this.b.contains($$0) ? td.a.b : super.a($$0);
      }
   }

   @Override
   public td.a a(ti<?> $$0, String $$1) {
      tq $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == sj.b) {
            tq $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return td.a.b;
      }
   }

   @Override
   public td.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

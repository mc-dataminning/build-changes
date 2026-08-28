import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vq extends vr {
   private int a;
   private final Set<vl<?>> b;
   private final Deque<vt> c = new ArrayDeque<>();

   public vq(vs... $$0) {
      this.a = $$0.length;
      Builder<vl<?>> $$1 = ImmutableSet.builder();
      vt $$2 = vt.a();

      for (vs $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(um.b);
      this.b = $$1.build();
   }

   @Override
   public vg.b b(vl<?> $$0) {
      return $$0 != um.b ? vg.b.c : super.b($$0);
   }

   @Override
   public vg.a a(vl<?> $$0) {
      vt $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return vg.a.d;
      } else {
         return !this.b.contains($$0) ? vg.a.b : super.a($$0);
      }
   }

   @Override
   public vg.a a(vl<?> $$0, String $$1) {
      vt $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == um.b) {
            vt $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return vg.a.b;
      }
   }

   @Override
   public vg.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class vo extends vp {
   private int a;
   private final Set<vj<?>> b;
   private final Deque<vr> c = new ArrayDeque<>();

   public vo(vq... $$0) {
      this.a = $$0.length;
      Builder<vj<?>> $$1 = ImmutableSet.builder();
      vr $$2 = vr.a();

      for (vq $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(uk.b);
      this.b = $$1.build();
   }

   @Override
   public ve.b b(vj<?> $$0) {
      return $$0 != uk.b ? ve.b.c : super.b($$0);
   }

   @Override
   public ve.a a(vj<?> $$0) {
      vr $$1 = this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return ve.a.d;
      } else {
         return !this.b.contains($$0) ? ve.a.b : super.a($$0);
      }
   }

   @Override
   public ve.a a(vj<?> $$0, String $$1) {
      vr $$2 = this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         this.a--;
         return super.a($$0, $$1);
      } else {
         if ($$0 == uk.b) {
            vr $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return ve.a.b;
      }
   }

   @Override
   public ve.b b() {
      if (this.e() == this.c.element().b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}

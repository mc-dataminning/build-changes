import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jf {
   a(je.c),
   b(je.c, je.f),
   c(je.f),
   d(je.d, je.f),
   e(je.d),
   f(je.d, je.e),
   g(je.e),
   h(je.c, je.e);

   private final Set<je> i;
   private final kd j;

   private jf(final je... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kd(0, 0, 0);

      for (je $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<je> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}

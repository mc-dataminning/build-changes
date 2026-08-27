import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum id {
   a(ic.c),
   b(ic.c, ic.f),
   c(ic.f),
   d(ic.d, ic.f),
   e(ic.d),
   f(ic.d, ic.e),
   g(ic.e),
   h(ic.c, ic.e);

   private final Set<ic> i;
   private final jb j;

   private id(ic... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jb(0, 0, 0);

      for (ic $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ic> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}

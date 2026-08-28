import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jc {
   a(jb.c),
   b(jb.c, jb.f),
   c(jb.f),
   d(jb.d, jb.f),
   e(jb.d),
   f(jb.d, jb.e),
   g(jb.e),
   h(jb.c, jb.e);

   private final Set<jb> i;
   private final ka j;

   private jc(final jb... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ka(0, 0, 0);

      for (jb $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jb> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}

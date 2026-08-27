import java.util.HashSet;
import java.util.Set;

public record zp(Set<jd> c, Set<jd> d) implements za {
   public static final xq<us, zp> a = za.a(zp::a, zp::new);
   public static final za.b<zp> b = za.a("debug/village_sections");

   private zp(us $$0) {
      this($$0.a(HashSet::new, us::g), $$0.a(HashSet::new, us::g));
   }

   private void a(us $$0) {
      $$0.a(this.c, us::a);
      $$0.a(this.d, us::a);
   }

   @Override
   public za.b<zp> a() {
      return b;
   }

   public Set<jd> b() {
      return this.c;
   }

   public Set<jd> c() {
      return this.d;
   }
}

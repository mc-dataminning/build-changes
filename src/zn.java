import java.util.HashSet;
import java.util.Set;

public record zn(Set<jb> c, Set<jb> d) implements yy {
   public static final xo<uq, zn> a = yy.a(zn::a, zn::new);
   public static final yy.b<zn> b = yy.a("debug/village_sections");

   private zn(uq $$0) {
      this($$0.a(HashSet::new, uq::g), $$0.a(HashSet::new, uq::g));
   }

   private void a(uq $$0) {
      $$0.a(this.c, uq::a);
      $$0.a(this.d, uq::a);
   }

   @Override
   public yy.b<zn> a() {
      return b;
   }

   public Set<jb> b() {
      return this.c;
   }

   public Set<jb> c() {
      return this.d;
   }
}

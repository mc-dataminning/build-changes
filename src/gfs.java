import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gfs {
   public static final Comparator<gfs> a = Comparator.<gfs, agt>comparing(gfs::a).thenComparing(gfs::b);
   private final agt b;
   private final agt c;
   @Nullable
   private fsq d;

   public gfs(agt $$0, agt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public agt a() {
      return this.b;
   }

   public agt b() {
      return this.c;
   }

   public gdo c() {
      return euk.N().a(this.a()).apply(this.b());
   }

   public fsq a(Function<agt, fsq> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eph a(fsi $$0, Function<agt, fsq> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eph a(fsi $$0, Function<agt, fsq> $$1, boolean $$2) {
      return this.c().a(fym.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gfs $$1 = (gfs)$$0;
         return this.b.equals($$1.b) && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.b + ", texture=" + this.c + "}";
   }
}

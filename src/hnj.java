import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hnj {
   public static final Comparator<hnj> a = Comparator.<hnj, alk>comparing(hnj::a).thenComparing(hnj::b);
   private final alk b;
   private final alk c;
   @Nullable
   private gsn d;

   public hnj(alk $$0, alk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alk a() {
      return this.b;
   }

   public alk b() {
      return this.c;
   }

   public hlc c() {
      return frf.Q().a(this.a()).apply(this.b());
   }

   public gsn a(Function<alk, gsn> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public flt a(gsc $$0, Function<alk, gsn> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public flt a(gsc $$0, Function<alk, gsn> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gzi.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hnj $$1 = (hnj)$$0;
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

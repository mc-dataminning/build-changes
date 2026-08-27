import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gkc {
   public static final Comparator<gkc> a = Comparator.<gkc, ajc>comparing(gkc::a).thenComparing(gkc::b);
   private final ajc b;
   private final ajc c;
   @Nullable
   private fwy d;

   public gkc(ajc $$0, ajc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ajc a() {
      return this.b;
   }

   public ajc b() {
      return this.c;
   }

   public ghz c() {
      return eyk.P().a(this.a()).apply(this.b());
   }

   public fwy a(Function<ajc, fwy> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eth a(fwq $$0, Function<ajc, fwy> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eth a(fwq $$0, Function<ajc, fwy> $$1, boolean $$2) {
      return this.c().a(gcw.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gkc $$1 = (gkc)$$0;
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

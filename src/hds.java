import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hds {
   public static final Comparator<hds> a = Comparator.<hds, alz>comparing(hds::a).thenComparing(hds::b);
   private final alz b;
   private final alz c;
   @Nullable
   private glt d;

   public hds(alz $$0, alz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public hbj c() {
      return fme.Q().a(this.a()).apply(this.b());
   }

   public glt a(Function<alz, glt> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fgu a(glj $$0, Function<alz, glt> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fgu a(glj $$0, Function<alz, glt> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gsm.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hds $$1 = (hds)$$0;
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

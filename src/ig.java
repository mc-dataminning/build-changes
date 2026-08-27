import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class ig {
   public static final Codec<ig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cti.g.fieldOf("dimension").forGetter(ig::a), hx.a.fieldOf("pos").forGetter(ig::b)).apply($$0, ig::a)
   );
   private final ahc<cti> b;
   private final hx c;

   private ig(ahc<cti> $$0, hx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ig a(ahc<cti> $$0, hx $$1) {
      return new ig($$0, $$1);
   }

   public ahc<cti> a() {
      return this.b;
   }

   public hx b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ig $$1 = (ig)$$0;
         return Objects.equals(this.b, $$1.b) && Objects.equals(this.c, $$1.c);
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
      return this.b + " " + this.c;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class id {
   public static final Codec<id> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csy.g.fieldOf("dimension").forGetter(id::a), hv.a.fieldOf("pos").forGetter(id::b)).apply($$0, id::a)
   );
   private final ags<csy> b;
   private final hv c;

   private id(ags<csy> $$0, hv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static id a(ags<csy> $$0, hv $$1) {
      return new id($$0, $$1);
   }

   public ags<csy> a() {
      return this.b;
   }

   public hv b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         id $$1 = (id)$$0;
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

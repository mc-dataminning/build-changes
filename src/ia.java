import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class ia {
   public static final Codec<ia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csa.g.fieldOf("dimension").forGetter(ia::a), ht.a.fieldOf("pos").forGetter(ia::b)).apply($$0, ia::a)
   );
   private final agh<csa> b;
   private final ht c;

   private ia(agh<csa> $$0, ht $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ia a(agh<csa> $$0, ht $$1) {
      return new ia($$0, $$1);
   }

   public agh<csa> a() {
      return this.b;
   }

   public ht b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ia $$1 = (ia)$$0;
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

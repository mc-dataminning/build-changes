import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class he {
   public static final Codec<he> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpk.g.fieldOf("dimension").forGetter(he::a), gv.a.fieldOf("pos").forGetter(he::b)).apply($$0, he::a)
   );
   private final aeo<cpk> b;
   private final gv c;

   private he(aeo<cpk> $$0, gv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static he a(aeo<cpk> $$0, gv $$1) {
      return new he($$0, $$1);
   }

   public aeo<cpk> a() {
      return this.b;
   }

   public gv b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         he $$1 = (he)$$0;
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

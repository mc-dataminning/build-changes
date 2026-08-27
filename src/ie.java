import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class ie {
   public static final Codec<ie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csf.g.fieldOf("dimension").forGetter(ie::a), hx.a.fieldOf("pos").forGetter(ie::b)).apply($$0, ie::a)
   );
   private final agl<csf> b;
   private final hx c;

   private ie(agl<csf> $$0, hx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ie a(agl<csf> $$0, hx $$1) {
      return new ie($$0, $$1);
   }

   public agl<csf> a() {
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
         ie $$1 = (ie)$$0;
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

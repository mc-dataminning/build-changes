import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class hf {
   public static final Codec<hf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpq.g.fieldOf("dimension").forGetter(hf::a), gw.a.fieldOf("pos").forGetter(hf::b)).apply($$0, hf::a)
   );
   private final aet<cpq> b;
   private final gw c;

   private hf(aet<cpq> $$0, gw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static hf a(aet<cpq> $$0, gw $$1) {
      return new hf($$0, $$1);
   }

   public aet<cpq> a() {
      return this.b;
   }

   public gw b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hf $$1 = (hf)$$0;
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

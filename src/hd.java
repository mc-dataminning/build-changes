import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class hd {
   public static final Codec<hd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cmm.g.fieldOf("dimension").forGetter(hd::a), gu.a.fieldOf("pos").forGetter(hd::b)).apply($$0, hd::a)
   );
   private final acp<cmm> b;
   private final gu c;

   private hd(acp<cmm> $$0, gu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static hd a(acp<cmm> $$0, gu $$1) {
      return new hd($$0, $$1);
   }

   public acp<cmm> a() {
      return this.b;
   }

   public gu b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hd $$1 = (hd)$$0;
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

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record kr(cv.d c, cv.d d) implements ks {
   public static final Codec<kr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cv.d.d.optionalFieldOf("durability", cv.d.c).forGetter(kr::a), cv.d.d.optionalFieldOf("damage", cv.d.c).forGetter(kr::b))
            .apply($$0, kr::new)
   );

   @Override
   public boolean a(ke $$0) {
      Integer $$1 = $$0.a(kj.e);
      if ($$1 == null) {
         return false;
      } else {
         int $$2 = $$0.a(kj.d, 0);
         return !this.c.d($$2 - $$1) ? false : this.d.d($$1);
      }
   }

   public static kr a(cv.d $$0) {
      return new kr($$0, cv.d.c);
   }

   public cv.d a() {
      return this.c;
   }

   public cv.d b() {
      return this.d;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ks(cw.d c, cw.d d) implements kt {
   public static final Codec<ks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cw.d.d.optionalFieldOf("durability", cw.d.c).forGetter(ks::a), cw.d.d.optionalFieldOf("damage", cw.d.c).forGetter(ks::b))
            .apply($$0, ks::new)
   );

   @Override
   public boolean a(kf $$0) {
      Integer $$1 = $$0.a(kk.e);
      if ($$1 == null) {
         return false;
      } else {
         int $$2 = $$0.a(kk.d, 0);
         return !this.c.d($$2 - $$1) ? false : this.d.d($$1);
      }
   }

   public static ks a(cw.d $$0) {
      return new ks($$0, cw.d.c);
   }

   public cw.d a() {
      return this.c;
   }

   public cw.d b() {
      return this.d;
   }
}

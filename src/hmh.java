import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmh(hmi d) {
   public static final hmh a = new hmh(hmi.b);
   public static final Codec<hmh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hmi.a.optionalFieldOf("scaling", hmi.b).forGetter(hmh::a)).apply($$0, hmh::new)
   );
   public static final aun<hmh> c = new aun<>("gui", b);

   public hmi a() {
      return this.d;
   }
}

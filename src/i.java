import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public enum i {
   a(0),
   b(1),
   c(2),
   d(3);

   public static final Codec<i> e = Codec.INT.comapFlatMap($$0 -> {
      return switch (azo.b($$0, 360)) {
         case 0 -> DataResult.success(a);
         case 90 -> DataResult.success(b);
         case 180 -> DataResult.success(c);
         case 270 -> DataResult.success(d);
         default -> DataResult.error(() -> "Invalid rotation " + $$0 + " found, only 0/90/180/270 allowed");
      };
   }, $$0 -> {
      return switch ($$0) {
         case a -> 0;
         case b -> 90;
         case c -> 180;
         case d -> 270;
      };
   });
   public final int f;

   private i(final int $$0) {
      this.f = $$0;
   }

   @Deprecated
   public static i a(int $$0) {
      return switch (azo.b($$0, 360)) {
         case 0 -> a;
         case 90 -> b;
         case 180 -> c;
         case 270 -> d;
         default -> throw new JsonParseException("Invalid rotation " + $$0 + " found, only 0/90/180/270 allowed");
      };
   }

   public int b(int $$0) {
      return ($$0 + this.f) % 4;
   }
}

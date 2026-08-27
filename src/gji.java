import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gji(gjm b, gjp c) {
   public static final Codec<gji> a = gjm.a.dispatchStable(gji::a, gjm::c);

   public gji(gjm b, gjp c) {
      c.b().forEach($$1x -> {
         if (!$$0.a($$1x)) {
            throw new IllegalArgumentException("Property '" + $$1x.b() + "' not expected for event: '" + $$0.a() + "'");
         }
      });
      this.b = b;
      this.c = c;
   }

   public TelemetryEvent a(TelemetrySession $$0) {
      return this.b.a($$0, this.c);
   }

   public gjm a() {
      return this.b;
   }

   public gjp b() {
      return this.c;
   }
}

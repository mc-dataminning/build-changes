import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gvi(gvm b, gvp c) {
   public static final Codec<gvi> a = gvm.a.dispatchStable(gvi::a, gvm::c);

   public gvi(gvm b, gvp c) {
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

   public gvm a() {
      return this.b;
   }

   public gvp b() {
      return this.c;
   }
}

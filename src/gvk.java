import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gvk(gvo b, gvr c) {
   public static final Codec<gvk> a = gvo.a.dispatchStable(gvk::a, gvo::c);

   public gvk(gvo b, gvr c) {
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

   public gvo a() {
      return this.b;
   }

   public gvr b() {
      return this.c;
   }
}

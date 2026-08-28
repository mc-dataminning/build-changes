import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gvd(gvh b, gvk c) {
   public static final Codec<gvd> a = gvh.a.dispatchStable(gvd::a, gvh::c);

   public gvd(gvh b, gvk c) {
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

   public gvh a() {
      return this.b;
   }

   public gvk b() {
      return this.c;
   }
}

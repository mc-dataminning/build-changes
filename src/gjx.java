import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gjx(gkb b, gke c) {
   public static final Codec<gjx> a = gkb.a.dispatchStable(gjx::a, gkb::c);

   public gjx(gkb b, gke c) {
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

   public gkb a() {
      return this.b;
   }

   public gke b() {
      return this.c;
   }
}

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gdq(gdu b, gdx c) {
   public static final Codec<gdq> a = gdu.a.dispatchStable(gdq::a, gdu::c);

   public gdq(gdu b, gdx c) {
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

   public gdu a() {
      return this.b;
   }

   public gdx b() {
      return this.c;
   }
}

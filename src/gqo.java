import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gqo(gqs b, gqv c) {
   public static final Codec<gqo> a = gqs.a.dispatchStable(gqo::a, gqs::c);

   public gqo(gqs b, gqv c) {
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

   public gqs a() {
      return this.b;
   }

   public gqv b() {
      return this.c;
   }
}

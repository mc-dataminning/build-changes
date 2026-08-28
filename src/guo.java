import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record guo(gus b, guv c) {
   public static final Codec<guo> a = gus.a.dispatchStable(guo::a, gus::c);

   public guo(gus b, guv c) {
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

   public gus a() {
      return this.b;
   }

   public guv b() {
      return this.c;
   }
}

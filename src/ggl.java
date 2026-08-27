import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record ggl(ggp b, ggs c) {
   public static final Codec<ggl> a = ggp.a.dispatchStable(ggl::a, ggp::c);

   public ggl(ggp b, ggs c) {
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

   public ggp a() {
      return this.b;
   }

   public ggs b() {
      return this.c;
   }
}

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record giw(gja b, gjd c) {
   public static final Codec<giw> a = gja.a.dispatchStable(giw::a, gja::c);

   public giw(gja b, gjd c) {
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

   public gja a() {
      return this.b;
   }

   public gjd b() {
      return this.c;
   }
}

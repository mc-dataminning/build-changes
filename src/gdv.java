import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gdv(gdz b, gec c) {
   public static final Codec<gdv> a = gdz.a.dispatchStable(gdv::a, gdz::c);

   public gdv(gdz b, gec c) {
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

   public gdz a() {
      return this.b;
   }

   public gec b() {
      return this.c;
   }
}

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gdl(gdp b, gds c) {
   public static final Codec<gdl> a = gdp.a.dispatchStable(gdl::a, gdp::c);

   public gdl(gdp b, gds c) {
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

   public gdp a() {
      return this.b;
   }

   public gds b() {
      return this.c;
   }
}

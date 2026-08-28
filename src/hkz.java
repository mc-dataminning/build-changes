import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hkz(hld b, hlg c) {
   public static final Codec<hkz> a = hld.a.dispatchStable(hkz::a, hld::c);

   public hkz(hld b, hlg c) {
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

   public hld a() {
      return this.b;
   }

   public hlg b() {
      return this.c;
   }
}

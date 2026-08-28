import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hkb(hkf b, hki c) {
   public static final Codec<hkb> a = hkf.a.dispatchStable(hkb::a, hkf::c);

   public hkb(hkf b, hki c) {
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

   public hkf a() {
      return this.b;
   }

   public hki b() {
      return this.c;
   }
}

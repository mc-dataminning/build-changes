import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hjz(hkd b, hkg c) {
   public static final Codec<hjz> a = hkd.a.dispatchStable(hjz::a, hkd::c);

   public hjz(hkd b, hkg c) {
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

   public hkd a() {
      return this.b;
   }

   public hkg b() {
      return this.c;
   }
}

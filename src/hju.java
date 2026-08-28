import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hju(hjy b, hkb c) {
   public static final Codec<hju> a = hjy.a.dispatchStable(hju::a, hjy::c);

   public hju(hjy b, hkb c) {
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

   public hjy a() {
      return this.b;
   }

   public hkb b() {
      return this.c;
   }
}

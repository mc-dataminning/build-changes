import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hof(hoj b, hom c) {
   public static final Codec<hof> a = hoj.a.dispatchStable(hof::a, hoj::c);

   public hof(hoj b, hom c) {
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

   public hoj a() {
      return this.b;
   }

   public hom b() {
      return this.c;
   }
}

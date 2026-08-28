import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hoz(hpd b, hpg c) {
   public static final Codec<hoz> a = hpd.a.dispatchStable(hoz::a, hpd::c);

   public hoz(hpd b, hpg c) {
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

   public hpd a() {
      return this.b;
   }

   public hpg b() {
      return this.c;
   }
}

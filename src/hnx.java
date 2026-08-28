import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hnx(hob b, hoe c) {
   public static final Codec<hnx> a = hob.a.dispatchStable(hnx::a, hob::c);

   public hnx(hob b, hoe c) {
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

   public hob a() {
      return this.b;
   }

   public hoe b() {
      return this.c;
   }
}

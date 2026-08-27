import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record ggq(ggu b, ggx c) {
   public static final Codec<ggq> a = ggu.a.dispatchStable(ggq::a, ggu::c);

   public ggq(ggu b, ggx c) {
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

   public ggu a() {
      return this.b;
   }

   public ggx b() {
      return this.c;
   }
}

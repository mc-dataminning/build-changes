import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hgl(hgp b, hgs c) {
   public static final Codec<hgl> a = hgp.a.dispatchStable(hgl::a, hgp::c);

   public hgl(hgp b, hgs c) {
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

   public hgp a() {
      return this.b;
   }

   public hgs b() {
      return this.c;
   }
}

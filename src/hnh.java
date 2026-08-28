import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hnh(hnl b, hno c) {
   public static final Codec<hnh> a = hnl.a.dispatchStable(hnh::a, hnl::c);

   public hnh(hnl b, hno c) {
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

   public hnl a() {
      return this.b;
   }

   public hno b() {
      return this.c;
   }
}

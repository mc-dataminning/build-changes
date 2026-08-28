import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hjt(hjx b, hka c) {
   public static final Codec<hjt> a = hjx.a.dispatchStable(hjt::a, hjx::c);

   public hjt(hjx b, hka c) {
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

   public hjx a() {
      return this.b;
   }

   public hka b() {
      return this.c;
   }
}

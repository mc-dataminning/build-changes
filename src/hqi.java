import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hqi(hqm b, hqp c) {
   public static final Codec<hqi> a = hqm.a.dispatchStable(hqi::a, hqm::c);

   public hqi(hqm b, hqp c) {
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

   public hqm a() {
      return this.b;
   }

   public hqp b() {
      return this.c;
   }
}

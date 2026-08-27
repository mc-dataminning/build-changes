import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gqf(gqj b, gqm c) {
   public static final Codec<gqf> a = gqj.a.dispatchStable(gqf::a, gqj::c);

   public gqf(gqj b, gqm c) {
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

   public gqj a() {
      return this.b;
   }

   public gqm b() {
      return this.c;
   }
}

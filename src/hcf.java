import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hcf(hcj b, hcm c) {
   public static final Codec<hcf> a = hcj.a.dispatchStable(hcf::a, hcj::c);

   public hcf(hcj b, hcm c) {
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

   public hcj a() {
      return this.b;
   }

   public hcm b() {
      return this.c;
   }
}

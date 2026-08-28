import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hgs(hgw b, hgz c) {
   public static final Codec<hgs> a = hgw.a.dispatchStable(hgs::a, hgw::c);

   public hgs(hgw b, hgz c) {
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

   public hgw a() {
      return this.b;
   }

   public hgz b() {
      return this.c;
   }
}

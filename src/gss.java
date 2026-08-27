import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gss(gsw b, gsz c) {
   public static final Codec<gss> a = gsw.a.dispatchStable(gss::a, gsw::c);

   public gss(gsw b, gsz c) {
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

   public gsw a() {
      return this.b;
   }

   public gsz b() {
      return this.c;
   }
}

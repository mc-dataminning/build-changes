import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hgq(hgu b, hgx c) {
   public static final Codec<hgq> a = hgu.a.dispatchStable(hgq::a, hgu::c);

   public hgq(hgu b, hgx c) {
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

   public hgu a() {
      return this.b;
   }

   public hgx b() {
      return this.c;
   }
}

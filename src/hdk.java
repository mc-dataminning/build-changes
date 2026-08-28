import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hdk(hdo b, hdr c) {
   public static final Codec<hdk> a = hdo.a.dispatchStable(hdk::a, hdo::c);

   public hdk(hdo b, hdr c) {
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

   public hdo a() {
      return this.b;
   }

   public hdr b() {
      return this.c;
   }
}

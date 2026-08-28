import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hgr(hgv b, hgy c) {
   public static final Codec<hgr> a = hgv.a.dispatchStable(hgr::a, hgv::c);

   public hgr(hgv b, hgy c) {
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

   public hgv a() {
      return this.b;
   }

   public hgy b() {
      return this.c;
   }
}

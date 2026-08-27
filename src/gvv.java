import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gvv(gvz b, gwc c) {
   public static final Codec<gvv> a = gvz.a.dispatchStable(gvv::a, gvz::c);

   public gvv(gvz b, gwc c) {
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

   public gvz a() {
      return this.b;
   }

   public gwc b() {
      return this.c;
   }
}

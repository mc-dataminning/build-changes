import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record glp(glt b, glw c) {
   public static final Codec<glp> a = glt.a.dispatchStable(glp::a, glt::c);

   public glp(glt b, glw c) {
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

   public glt a() {
      return this.b;
   }

   public glw b() {
      return this.c;
   }
}

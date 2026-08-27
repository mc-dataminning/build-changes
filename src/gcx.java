import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gcx(gdb b, gde c) {
   public static final Codec<gcx> a = gdb.a.dispatchStable(gcx::a, gdb::c);

   public gcx(gdb b, gde c) {
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

   public gdb a() {
      return this.b;
   }

   public gde b() {
      return this.c;
   }
}

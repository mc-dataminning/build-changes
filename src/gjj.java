import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gjj(gjn b, gjq c) {
   public static final Codec<gjj> a = gjn.a.dispatchStable(gjj::a, gjn::c);

   public gjj(gjn b, gjq c) {
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

   public gjn a() {
      return this.b;
   }

   public gjq b() {
      return this.c;
   }
}

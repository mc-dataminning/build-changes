import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record fzh(fzl b, fzo c) {
   public static final Codec<fzh> a = fzl.a.dispatchStable(fzh::a, fzl::c);

   public fzh(fzl b, fzo c) {
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

   public fzl a() {
      return this.b;
   }

   public fzo b() {
      return this.c;
   }
}

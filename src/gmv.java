import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record gmv(gmz b, gnc c) {
   public static final Codec<gmv> a = gmz.a.dispatchStable(gmv::a, gmz::c);

   public gmv(gmz b, gnc c) {
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

   public gmz a() {
      return this.b;
   }

   public gnc b() {
      return this.c;
   }
}

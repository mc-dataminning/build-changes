import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record grv(grz b, gsc c) {
   public static final Codec<grv> a = grz.a.dispatchStable(grv::a, grz::c);

   public grv(grz b, gsc c) {
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

   public grz a() {
      return this.b;
   }

   public gsc b() {
      return this.c;
   }
}

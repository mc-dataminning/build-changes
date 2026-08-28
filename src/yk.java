import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yk(int b, UUID c, UUID d) {
   public static final Codec<yk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.k.fieldOf("index").forGetter(yk::b), kc.a.fieldOf("sender").forGetter(yk::c), kc.a.fieldOf("session_id").forGetter(yk::d))
            .apply($$0, yk::new)
   );

   public static yk a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static yk a(UUID $$0, UUID $$1) {
      return new yk(0, $$0, $$1);
   }

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(kc.b(this.c));
      $$0.update(kc.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yk $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yk a() {
      return this.b == Integer.MAX_VALUE ? null : new yk(this.b + 1, this.c, this.d);
   }
}

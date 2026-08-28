import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xp(int b, UUID c, UUID d) {
   public static final Codec<xp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axm.k.fieldOf("index").forGetter(xp::b), kd.a.fieldOf("sender").forGetter(xp::c), kd.a.fieldOf("session_id").forGetter(xp::d))
            .apply($$0, xp::new)
   );

   public static xp a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static xp a(UUID $$0, UUID $$1) {
      return new xp(0, $$0, $$1);
   }

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(kd.b(this.c));
      $$0.update(kd.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xp $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xp a() {
      return this.b == Integer.MAX_VALUE ? null : new xp(this.b + 1, this.c, this.d);
   }
}

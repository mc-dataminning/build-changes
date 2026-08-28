import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xk(int b, UUID c, UUID d) {
   public static final Codec<xk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.l.fieldOf("index").forGetter(xk::b), kl.a.fieldOf("sender").forGetter(xk::c), kl.a.fieldOf("session_id").forGetter(xk::d))
            .apply($$0, xk::new)
   );

   public static xk a(UUID $$0) {
      return a($$0, af.e);
   }

   public static xk a(UUID $$0, UUID $$1) {
      return new xk(0, $$0, $$1);
   }

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(kl.b(this.c));
      $$0.update(kl.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xk $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xk a() {
      return this.b == Integer.MAX_VALUE ? null : new xk(this.b + 1, this.c, this.d);
   }
}

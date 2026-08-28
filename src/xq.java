import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xq(int b, UUID c, UUID d) {
   public static final Codec<xq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.l.fieldOf("index").forGetter(xq::b), km.a.fieldOf("sender").forGetter(xq::c), km.a.fieldOf("session_id").forGetter(xq::d))
            .apply($$0, xq::new)
   );

   public static xq a(UUID $$0) {
      return a($$0, af.e);
   }

   public static xq a(UUID $$0, UUID $$1) {
      return new xq(0, $$0, $$1);
   }

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(km.b(this.c));
      $$0.update(km.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xq $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xq a() {
      return this.b == Integer.MAX_VALUE ? null : new xq(this.b + 1, this.c, this.d);
   }
}

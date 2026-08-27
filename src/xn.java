import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xn(int b, UUID c, UUID d) {
   public static final Codec<xn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.i.fieldOf("index").forGetter(xn::b), jp.a.fieldOf("sender").forGetter(xn::c), jp.a.fieldOf("session_id").forGetter(xn::d))
            .apply($$0, xn::new)
   );

   public static xn a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static xn a(UUID $$0, UUID $$1) {
      return new xn(0, $$0, $$1);
   }

   public void a(ayh.a $$0) throws SignatureException {
      $$0.update(jp.b(this.c));
      $$0.update(jp.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xn $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xn a() {
      return this.b == Integer.MAX_VALUE ? null : new xn(this.b + 1, this.c, this.d);
   }
}

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xr(int b, UUID c, UUID d) {
   public static final Codec<xr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.l.fieldOf("index").forGetter(xr::b), jy.a.fieldOf("sender").forGetter(xr::c), jy.a.fieldOf("session_id").forGetter(xr::d))
            .apply($$0, xr::new)
   );

   public static xr a(UUID $$0) {
      return a($$0, af.e);
   }

   public static xr a(UUID $$0, UUID $$1) {
      return new xr(0, $$0, $$1);
   }

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(jy.b(this.c));
      $$0.update(jy.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xr $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xr a() {
      return this.b == Integer.MAX_VALUE ? null : new xr(this.b + 1, this.c, this.d);
   }
}

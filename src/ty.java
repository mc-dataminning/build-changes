import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record ty(int b, UUID c, UUID d) {
   public static final Codec<ty> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqw.i.fieldOf("index").forGetter(ty::b), hz.a.fieldOf("sender").forGetter(ty::c), hz.a.fieldOf("session_id").forGetter(ty::d))
            .apply($$0, ty::new)
   );

   public static ty a(UUID $$0) {
      return a($$0, ac.c);
   }

   public static ty a(UUID $$0, UUID $$1) {
      return new ty(0, $$0, $$1);
   }

   public void a(arw.a $$0) throws SignatureException {
      $$0.update(hz.b(this.c));
      $$0.update(hz.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(ty $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public ty a() {
      return this.b == Integer.MAX_VALUE ? null : new ty(this.b + 1, this.c, this.d);
   }
}

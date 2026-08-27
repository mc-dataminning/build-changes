import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xd(int b, UUID c, UUID d) {
   public static final Codec<xd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.i.fieldOf("index").forGetter(xd::b), jh.a.fieldOf("sender").forGetter(xd::c), jh.a.fieldOf("session_id").forGetter(xd::d))
            .apply($$0, xd::new)
   );

   public static xd a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static xd a(UUID $$0, UUID $$1) {
      return new xd(0, $$0, $$1);
   }

   public void a(axx.a $$0) throws SignatureException {
      $$0.update(jh.b(this.c));
      $$0.update(jh.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xd $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xd a() {
      return this.b == Integer.MAX_VALUE ? null : new xd(this.b + 1, this.c, this.d);
   }
}

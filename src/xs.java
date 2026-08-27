import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xs(int b, UUID c, UUID d) {
   public static final Codec<xs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axn.i.fieldOf("index").forGetter(xs::b), jr.a.fieldOf("sender").forGetter(xs::c), jr.a.fieldOf("session_id").forGetter(xs::d))
            .apply($$0, xs::new)
   );

   public static xs a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static xs a(UUID $$0, UUID $$1) {
      return new xs(0, $$0, $$1);
   }

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(jr.b(this.c));
      $$0.update(jr.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xs $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xs a() {
      return this.b == Integer.MAX_VALUE ? null : new xs(this.b + 1, this.c, this.d);
   }
}

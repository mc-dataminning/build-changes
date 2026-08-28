import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yj(int b, UUID c, UUID d) {
   public static final Codec<yj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayg.k.fieldOf("index").forGetter(yj::b), kc.a.fieldOf("sender").forGetter(yj::c), kc.a.fieldOf("session_id").forGetter(yj::d))
            .apply($$0, yj::new)
   );

   public static yj a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static yj a(UUID $$0, UUID $$1) {
      return new yj(0, $$0, $$1);
   }

   public void a(azk.a $$0) throws SignatureException {
      $$0.update(kc.b(this.c));
      $$0.update(kc.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yj $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yj a() {
      return this.b == Integer.MAX_VALUE ? null : new yj(this.b + 1, this.c, this.d);
   }
}

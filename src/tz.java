import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record tz(int b, UUID c, UUID d) {
   public static final Codec<tz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.i.fieldOf("index").forGetter(tz::b), hy.a.fieldOf("sender").forGetter(tz::c), hy.a.fieldOf("session_id").forGetter(tz::d))
            .apply($$0, tz::new)
   );

   public static tz a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static tz a(UUID $$0, UUID $$1) {
      return new tz(0, $$0, $$1);
   }

   public void a(ary.a $$0) throws SignatureException {
      $$0.update(hy.b(this.c));
      $$0.update(hy.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(tz $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public tz a() {
      return this.b == Integer.MAX_VALUE ? null : new tz(this.b + 1, this.c, this.d);
   }
}

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yd(int b, UUID c, UUID d) {
   public static final Codec<yd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayt.l.fieldOf("index").forGetter(yd::b), kk.a.fieldOf("sender").forGetter(yd::c), kk.a.fieldOf("session_id").forGetter(yd::d))
            .apply($$0, yd::new)
   );

   public static yd a(UUID $$0) {
      return a($$0, ae.e);
   }

   public static yd a(UUID $$0, UUID $$1) {
      return new yd(0, $$0, $$1);
   }

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(kk.b(this.c));
      $$0.update(kk.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yd $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yd a() {
      return this.b == Integer.MAX_VALUE ? null : new yd(this.b + 1, this.c, this.d);
   }
}

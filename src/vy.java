import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record vy(int b, UUID c, UUID d) {
   public static final Codec<vy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.i.fieldOf("index").forGetter(vy::b), ja.a.fieldOf("sender").forGetter(vy::c), ja.a.fieldOf("session_id").forGetter(vy::d))
            .apply($$0, vy::new)
   );

   public static vy a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static vy a(UUID $$0, UUID $$1) {
      return new vy(0, $$0, $$1);
   }

   public void a(auu.a $$0) throws SignatureException {
      $$0.update(ja.b(this.c));
      $$0.update(ja.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(vy $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public vy a() {
      return this.b == Integer.MAX_VALUE ? null : new vy(this.b + 1, this.c, this.d);
   }
}

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record vq(int b, UUID c, UUID d) {
   public static final Codec<vq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.i.fieldOf("index").forGetter(vq::b), iz.a.fieldOf("sender").forGetter(vq::c), iz.a.fieldOf("session_id").forGetter(vq::d))
            .apply($$0, vq::new)
   );

   public static vq a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static vq a(UUID $$0, UUID $$1) {
      return new vq(0, $$0, $$1);
   }

   public void a(aub.a $$0) throws SignatureException {
      $$0.update(iz.b(this.c));
      $$0.update(iz.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(vq $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public vq a() {
      return this.b == Integer.MAX_VALUE ? null : new vq(this.b + 1, this.c, this.d);
   }
}

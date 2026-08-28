import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yq(int b, UUID c, UUID d) {
   public static final Codec<yq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.l.fieldOf("index").forGetter(yq::b), kk.a.fieldOf("sender").forGetter(yq::c), kk.a.fieldOf("session_id").forGetter(yq::d))
            .apply($$0, yq::new)
   );

   public static yq a(UUID $$0) {
      return a($$0, ae.e);
   }

   public static yq a(UUID $$0, UUID $$1) {
      return new yq(0, $$0, $$1);
   }

   public void a(baq.a $$0) throws SignatureException {
      $$0.update(kk.b(this.c));
      $$0.update(kk.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yq $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yq a() {
      return this.b == Integer.MAX_VALUE ? null : new yq(this.b + 1, this.c, this.d);
   }
}

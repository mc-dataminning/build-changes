import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yc(int b, UUID c, UUID d) {
   public static final Codec<yc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.l.fieldOf("index").forGetter(yc::b), kj.a.fieldOf("sender").forGetter(yc::c), kj.a.fieldOf("session_id").forGetter(yc::d))
            .apply($$0, yc::new)
   );

   public static yc a(UUID $$0) {
      return a($$0, ad.e);
   }

   public static yc a(UUID $$0, UUID $$1) {
      return new yc(0, $$0, $$1);
   }

   public void a(azv.a $$0) throws SignatureException {
      $$0.update(kj.b(this.c));
      $$0.update(kj.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yc $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yc a() {
      return this.b == Integer.MAX_VALUE ? null : new yc(this.b + 1, this.c, this.d);
   }
}

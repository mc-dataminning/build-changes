import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xy(int b, UUID c, UUID d) {
   public static final Codec<xy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayl.k.fieldOf("index").forGetter(xy::b), kh.a.fieldOf("sender").forGetter(xy::c), kh.a.fieldOf("session_id").forGetter(xy::d))
            .apply($$0, xy::new)
   );

   public static xy a(UUID $$0) {
      return a($$0, ad.e);
   }

   public static xy a(UUID $$0, UUID $$1) {
      return new xy(0, $$0, $$1);
   }

   public void a(azo.a $$0) throws SignatureException {
      $$0.update(kh.b(this.c));
      $$0.update(kh.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xy $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xy a() {
      return this.b == Integer.MAX_VALUE ? null : new xy(this.b + 1, this.c, this.d);
   }
}

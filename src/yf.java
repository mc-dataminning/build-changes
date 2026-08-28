import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yf(int b, UUID c, UUID d) {
   public static final Codec<yf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azd.l.fieldOf("index").forGetter(yf::b), kk.a.fieldOf("sender").forGetter(yf::c), kk.a.fieldOf("session_id").forGetter(yf::d))
            .apply($$0, yf::new)
   );

   public static yf a(UUID $$0) {
      return a($$0, ae.e);
   }

   public static yf a(UUID $$0, UUID $$1) {
      return new yf(0, $$0, $$1);
   }

   public void a(bag.a $$0) throws SignatureException {
      $$0.update(kk.b(this.c));
      $$0.update(kk.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yf $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yf a() {
      return this.b == Integer.MAX_VALUE ? null : new yf(this.b + 1, this.c, this.d);
   }
}

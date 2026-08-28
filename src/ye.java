import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record ye(int b, UUID c, UUID d) {
   public static final Codec<ye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayv.l.fieldOf("index").forGetter(ye::b), kk.a.fieldOf("sender").forGetter(ye::c), kk.a.fieldOf("session_id").forGetter(ye::d))
            .apply($$0, ye::new)
   );

   public static ye a(UUID $$0) {
      return a($$0, ae.e);
   }

   public static ye a(UUID $$0, UUID $$1) {
      return new ye(0, $$0, $$1);
   }

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(kk.b(this.c));
      $$0.update(kk.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(ye $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public ye a() {
      return this.b == Integer.MAX_VALUE ? null : new ye(this.b + 1, this.c, this.d);
   }
}

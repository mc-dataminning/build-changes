import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xu(int b, UUID c, UUID d) {
   public static final Codec<xu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axw.k.fieldOf("index").forGetter(xu::b), kg.a.fieldOf("sender").forGetter(xu::c), kg.a.fieldOf("session_id").forGetter(xu::d))
            .apply($$0, xu::new)
   );

   public static xu a(UUID $$0) {
      return a($$0, ad.e);
   }

   public static xu a(UUID $$0, UUID $$1) {
      return new xu(0, $$0, $$1);
   }

   public void a(aza.a $$0) throws SignatureException {
      $$0.update(kg.b(this.c));
      $$0.update(kg.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xu $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xu a() {
      return this.b == Integer.MAX_VALUE ? null : new xu(this.b + 1, this.c, this.d);
   }
}

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xz(int b, UUID c, UUID d) {
   public static final Codec<xz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayo.k.fieldOf("index").forGetter(xz::b), ki.a.fieldOf("sender").forGetter(xz::c), ki.a.fieldOf("session_id").forGetter(xz::d))
            .apply($$0, xz::new)
   );

   public static xz a(UUID $$0) {
      return a($$0, ad.e);
   }

   public static xz a(UUID $$0, UUID $$1) {
      return new xz(0, $$0, $$1);
   }

   public void a(azr.a $$0) throws SignatureException {
      $$0.update(ki.b(this.c));
      $$0.update(ki.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xz $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xz a() {
      return this.b == Integer.MAX_VALUE ? null : new xz(this.b + 1, this.c, this.d);
   }
}

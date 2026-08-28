import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xt(int b, UUID c, UUID d) {
   public static final Codec<xt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axv.k.fieldOf("index").forGetter(xt::b), kg.a.fieldOf("sender").forGetter(xt::c), kg.a.fieldOf("session_id").forGetter(xt::d))
            .apply($$0, xt::new)
   );

   public static xt a(UUID $$0) {
      return a($$0, ad.e);
   }

   public static xt a(UUID $$0, UUID $$1) {
      return new xt(0, $$0, $$1);
   }

   public void a(ayz.a $$0) throws SignatureException {
      $$0.update(kg.b(this.c));
      $$0.update(kg.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xt $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xt a() {
      return this.b == Integer.MAX_VALUE ? null : new xt(this.b + 1, this.c, this.d);
   }
}

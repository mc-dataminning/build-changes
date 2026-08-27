import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record wa(int b, UUID c, UUID d) {
   public static final Codec<wa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atv.i.fieldOf("index").forGetter(wa::b), ja.a.fieldOf("sender").forGetter(wa::c), ja.a.fieldOf("session_id").forGetter(wa::d))
            .apply($$0, wa::new)
   );

   public static wa a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static wa a(UUID $$0, UUID $$1) {
      return new wa(0, $$0, $$1);
   }

   public void a(ava.a $$0) throws SignatureException {
      $$0.update(ja.b(this.c));
      $$0.update(ja.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(wa $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public wa a() {
      return this.b == Integer.MAX_VALUE ? null : new wa(this.b + 1, this.c, this.d);
   }
}

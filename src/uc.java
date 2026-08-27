import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record uc(int b, UUID c, UUID d) {
   public static final Codec<uc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.i.fieldOf("index").forGetter(uc::b), ia.a.fieldOf("sender").forGetter(uc::c), ia.a.fieldOf("session_id").forGetter(uc::d))
            .apply($$0, uc::new)
   );

   public static uc a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static uc a(UUID $$0, UUID $$1) {
      return new uc(0, $$0, $$1);
   }

   public void a(asb.a $$0) throws SignatureException {
      $$0.update(ia.b(this.c));
      $$0.update(ia.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(uc $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public uc a() {
      return this.b == Integer.MAX_VALUE ? null : new uc(this.b + 1, this.c, this.d);
   }
}

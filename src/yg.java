import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yg(int b, UUID c, UUID d) {
   public static final Codec<yg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayc.k.fieldOf("index").forGetter(yg::b), kc.a.fieldOf("sender").forGetter(yg::c), kc.a.fieldOf("session_id").forGetter(yg::d))
            .apply($$0, yg::new)
   );

   public static yg a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static yg a(UUID $$0, UUID $$1) {
      return new yg(0, $$0, $$1);
   }

   public void a(azg.a $$0) throws SignatureException {
      $$0.update(kc.b(this.c));
      $$0.update(kc.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yg $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yg a() {
      return this.b == Integer.MAX_VALUE ? null : new yg(this.b + 1, this.c, this.d);
   }
}
